package visitor.codeGenerator;

import LocalVarsArray.LocalVars;
import LocalVarsArray.LocalVarsStack;
import ast.node.Program;
import ast.node.declaration.ArgDeclaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.BooleanValue;
import ast.node.expression.values.FloatValue;
import ast.node.expression.values.IntValue;
import ast.node.statement.*;
import ast.type.Type;
import byteCode.FunctionByteCode;
import byteCode.ISA.*;
import byteCode.MainByteCode;
import visitor.Visitor;

import javax.swing.*;
import java.util.ArrayList;

public class CodeGenerator extends Visitor<ArrayList<ByteCode>> {

    private MainByteCode mainByteCode_;
    private ArrayList<FunctionByteCode> functionByteCodes_ = new ArrayList<>();

    @Override
    public ArrayList<ByteCode> visit(Program program) {
        LocalVarsStack.push(new LocalVars());
        ArrayList<ByteCode> res = new ArrayList<>();
        for (FuncDeclaration funcDeclaration : program.getFuncs()) {
            ArrayList<ByteCode> functionBody = funcDeclaration.accept(this);
            ArrayList<Type> argsTypes = new ArrayList<>();
            for (ArgDeclaration arg : funcDeclaration.getArgs())
                argsTypes.add(arg.getType());
            functionByteCodes_.add(new FunctionByteCode(
                    functionBody,
                    funcDeclaration.getName().getName(),
                    funcDeclaration.getType(),
                    argsTypes
            ));
            res.addAll(functionBody);
        }
        res.addAll(program.getMain().accept(this));
        return res;
    }

    public ArrayList<ByteCode> visit(MainDeclaration mainDeclaration) {
        //TODO put jasmin annotations
        LocalVarsStack.push(new LocalVars());
        ArrayList<ByteCode> res = new ArrayList<>();
        for (Statement stmt : mainDeclaration.getMainStatements())
            res.addAll(stmt.accept(this));
        mainByteCode_ = new MainByteCode(res);
        return res;
    }

    public ArrayList<ByteCode> visit(FuncDeclaration functionDeclaration) {
        //TODO put jasmin annotations
        LocalVarsStack.push(new LocalVars());
        for (ArgDeclaration argDec : functionDeclaration.getArgs())
            LocalVarsStack.top.pushVar(argDec.getIdentifier().getName());

        ArrayList<ByteCode> res = new ArrayList<>();
        for (Statement stmt : functionDeclaration.getStatements())
            res.addAll(stmt.accept(this));

        LocalVarsStack.pop();
        return res;
    }

    public ArrayList<ByteCode> visit(VarDecStmt varDecStmt) {
        LocalVarsStack.top.pushVar(varDecStmt.getIdentifier().getName());
        ArrayList<ByteCode> res = new ArrayList<>();

        if (varDecStmt.getInitialExpression() == null) {
            res.add(new Iconst(0));
        } else {
            res.addAll(varDecStmt.getInitialExpression().accept(this));
        }

        res.add(new Istore(LocalVarsStack.top.slotOf(varDecStmt.getIdentifier().getName())));
        return res;
    }


    public ArrayList<ByteCode> visit(ArrayDecStmt arrayDecStmt) {
        LocalVarsStack.top.pushVar(arrayDecStmt.getIdentifier().getName());
        ArrayList<ByteCode> res = new ArrayList<>();

        if (arrayDecStmt.getArrSize() <= 3) {
            res.add(new Iconst(arrayDecStmt.getArrSize())); // TODO
        } else {
            res.add(new Bipush(arrayDecStmt.getArrSize()));
        }
        res.add(new Newarray());
        res.add(new Astore(LocalVarsStack.top.slotOf(arrayDecStmt.getIdentifier().getName())));

        if (arrayDecStmt.getInitialValues() == null) {
            return res;
        }

        for (int i = 0; i < arrayDecStmt.getArrSize(); i++) {
            res.add(new Aload(LocalVarsStack.top.slotOf(arrayDecStmt.getIdentifier().getName())));
            // TODO use dup instead

            if (i <= 3) {
                res.add(new Iconst(i));
            } else {
                res.add(new Bipush(i));
            }

            res.addAll(arrayDecStmt.getInitialValues().get(i).accept((this)));
            res.add(new Iastore());
        }
        return res;
    }


    public ArrayList<ByteCode> visit(ReturnStmt returnStmt) {
        ArrayList<ByteCode> res = new ArrayList<>();
        if (returnStmt.getExpression() != null)
            res.addAll(returnStmt.getExpression().accept(this));
        //TODO specify return type
        res.add(new Ireturn());
        return res;
    }


    public ArrayList<ByteCode> visit(AssignStmt assignStmt) {
        ArrayList<ByteCode> res = new ArrayList<>();
        if (assignStmt.getLValue() instanceof Identifier)
            res.addAll(variableLeftValue(assignStmt));
        else
            res.addAll(arrayAccessLeftValue(assignStmt));
        return res;
    }


    // Expressions
    public ArrayList<ByteCode> visit(BinaryExpression e) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();

        res.addAll(e.getLeft().accept(this));
        res.addAll((e.getRight().accept(this)));

        if (e.getBinaryOperator().equals(BinaryOperator.mult)) {
            res.add(new Imul());
        } else if (e.getBinaryOperator().equals(BinaryOperator.add)) {
            res.add(new Iadd());
        } else if (e.getBinaryOperator().equals(BinaryOperator.sub)) {
            res.add(new Isub());
        } else if (e.getBinaryOperator().equals(BinaryOperator.div)) {
            res.add(new Idiv());
        } else if (e.getBinaryOperator().equals(BinaryOperator.mod)) {
            res.add(new Irem());
        }
        return res;
    }

    public ArrayList<ByteCode> visit(UnaryExpression e) {
        ArrayList<ByteCode> res = new ArrayList<>();

        res.addAll(e.getOperand().accept(this));

        if (e.getUnaryOperator().equals(UnaryOperator.minus)) {
            res.add(new Iconst(1));
            res.add(new Isub());
        } else if (e.getUnaryOperator().equals(UnaryOperator.plus)) {
            res.add(new Iconst(1));
            res.add(new Iadd());
        } else {
            res.add(new Ineg());
        }

        return res;
    }

    public ArrayList<ByteCode> visit(ArrayAccess arrayAccess) {
        ArrayList<ByteCode> res = new ArrayList<>();
        res.add(new Aload(LocalVarsStack.top.slotOf(arrayAccess.getName())));
        res.addAll(arrayAccess.getIndex().accept(this));
        //The grammar doesn't support recognizing left vales; Therefore every left value is considered
        //to be either an ArrayAccess or and Identifier. To fix this, these concepts should be seperated
        //in either the grammar or the code generation phase.
        res.add(new Iaload());
        return res;
    }


    public ArrayList<ByteCode> visit(Identifier identifier) {
        ArrayList<ByteCode> res = new ArrayList<>();
        res.add(new Iload(LocalVarsStack.top.slotOf(identifier.getName())));
        return res;
    }

    public ArrayList<ByteCode> visit(IntValue intValue) {
        ArrayList<ByteCode> res = new ArrayList<>();
        if (intValue.getConstant() > 5)
            res.add(new Bipush(intValue.getConstant()));
        else
            res.add(new Iconst(intValue.getConstant()));
        return res;
    }

    public ArrayList<ByteCode> visit(FloatValue floatValue) {
        ArrayList<ByteCode> res = new ArrayList<>();
        res.add(new Ldc(String.valueOf(floatValue.getConstant())));
        return res;
    }

    public ArrayList<ByteCode> visit(BooleanValue booleanValue) {
        ArrayList<ByteCode> res = new ArrayList<>();
        if (booleanValue.getConstant())
            res.add(new Iconst(1));
        else
            res.add(new Iconst(0));
        return res;
    }

    public ArrayList<ByteCode> visit(FunctionCall functionCall) {
        ArrayList<ByteCode> res = new ArrayList<>();
        for (Expression e : functionCall.getArgs())
            res.addAll(e.accept(this));
        Invokestatic invokestatic = new Invokestatic(functionCall.getUFuncName().getName());
        //TODO get corresponding function declaration
        res.add(invokestatic);
        return res;
    }

    public String getGeneratedByteCode() {
        String res = "";
        for (FunctionByteCode functionByteCode : functionByteCodes_)
            res += functionByteCode.toString();
        res += mainByteCode_.toString();
        return res;
    }

    private ArrayList<ByteCode> arrayAccessLeftValue(AssignStmt assignStmt) {
        ArrayAccess arrayAccess = (ArrayAccess)assignStmt.getLValue();
        ArrayList<ByteCode> res = new ArrayList<>();
        //Load array reference
        res.add(new Aload(LocalVarsStack.top.slotOf(arrayAccess.getName())));
        //Load index
        res.addAll(arrayAccess.getIndex().accept(this));
        //Load value
        res.addAll((assignStmt.getRValue().accept(this)));
        //Store
        res.add((new Iastore()));
        return res;
    }


    private ArrayList<ByteCode> variableLeftValue(AssignStmt assignStmt) {
        Identifier identifier = (Identifier)assignStmt.getLValue();
        ArrayList<ByteCode> res = new ArrayList<>();
        //TODO check if assignStmt should store a variable as its left value in type checking phase.
        //TODO add different types
        res.addAll(assignStmt.getRValue().accept(this));
        res.add(new Istore(LocalVarsStack.top.slotOf(identifier.getName())));
        return res;
    }

}
