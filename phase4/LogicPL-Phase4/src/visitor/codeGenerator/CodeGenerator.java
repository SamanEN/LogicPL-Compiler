package visitor.codeGenerator;

import ast.node.Program;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.BooleanValue;
import ast.node.expression.values.FloatValue;
import ast.node.expression.values.IntValue;
import ast.node.expression.values.Value;
import ast.node.statement.ArrayDecStmt;
import ast.node.statement.ReturnStmt;
import ast.node.statement.Statement;
import ast.node.statement.VarDecStmt;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.IntType;
import byteCode.*;
import visitor.Visitor;

import java.util.ArrayList;

public class CodeGenerator extends Visitor<ArrayList<ByteCode>> {
    @Override
    public ArrayList<ByteCode> visit(Program program) {
        ArrayList<ByteCode> res = new ArrayList<>();
        for (FuncDeclaration funcDeclaration : program.getFuncs())
            res.addAll(funcDeclaration.accept(this));
        res.addAll(program.getMain().accept(this));
        return res;
    }

    public ArrayList<ByteCode> visit(MainDeclaration mainDeclaration) {
        //TODO put jasmin annotations
        //TODO must push local vars array stack here
        ArrayList<ByteCode> res = new ArrayList<>();
        for (Statement stmt : mainDeclaration.getMainStatements())
            res.addAll(stmt.accept(this));
        return res;
    }

    public ArrayList<ByteCode> visit(FuncDeclaration functionDeclaration) {
        //TODO put jasmin annotations
        //TODO must push local vars array stack here
        ArrayList<ByteCode> res = new ArrayList<>();
        for (Statement stmt : functionDeclaration.getStatements())
            res.addAll(stmt.accept(this));
        return res;
    }

    public ArrayList<ByteCode> visit(VarDecStmt varDecStmt) {
        ArrayList<ByteCode> res = new ArrayList<>();

        if (varDecStmt.getInitialExpression() == null) {
            res.add(new Iconst(0));
        } else {
            res.addAll(varDecStmt.getInitialExpression().accept(this));
        }

        res.add(new Istore(slotOf(varDecStmt.getIdentifier())));
        return res;
    }


    public ArrayList<ByteCode> visit(ArrayDecStmt arrayDecStmt) {
        ArrayList<ByteCode> res = new ArrayList<>();

        if (arrayDecStmt.getArrSize() <= 3) {
            res.add(new Iconst(arrayDecStmt.getArrSize())); // TODO
        } else {
            res.add(new Bipush(arrayDecStmt.getArrSize()));
        }
        res.add(new Newarray());
        res.add(new Astore(slotOf(arrayDecStmt.getIdentifier())));

        if (arrayDecStmt.getInitialValues() == null) {
            return res;
        }

        for (int i = 0; i < arrayDecStmt.getArrSize(); i++) {
            res.add(new Aload(slotOf(arrayDecStmt.getIdentifier())));
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
        if(returnStmt.getExpression() != null)
            res.addAll(returnStmt.getExpression().accept(this));
        //TODO specify return type
        res.add(new Ireturn());
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
        res.add(new Aload(slotOf(arrayAccess.getName())));
        res.addAll(arrayAccess.getIndex().accept(this));
        //The grammar doesn't support recognizing left vales; Therefore every left value is considered
        //to be either an ArrayAccess or and Identifier. To fix this, these concepts should be seperated
        //in either the grammar or the code generation phase.
        res.add(new Iaload());
        return res;
    }


    public ArrayList<ByteCode> visit(Identifier identifier) {
        ArrayList<ByteCode> res = new ArrayList<>();
        res.add(new Iload(slotOf(identifier.getName())));
        return res;
    }

    public ArrayList<ByteCode> visit(Value value) {
        ArrayList<ByteCode> res = new ArrayList<>();
        if (value.getType() instanceof BooleanType) {
            if (((BooleanValue) value).getConstant())
                res.add(new Iconst(1));
            else
                res.add(new Iconst(0));
        } else if (value.getType() instanceof IntType) {
            IntValue intValue = (IntValue) value;
            if (intValue.getConstant() > 5)
                res.add(new Bipush(intValue.getConstant()));
            else
                res.add(new Iconst(intValue.getConstant()));
        } else {
            res.add(new Ldc(String.valueOf(((FloatValue) value).getConstant())));
        }
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

}
