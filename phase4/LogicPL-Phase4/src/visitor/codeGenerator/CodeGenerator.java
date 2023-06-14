package visitor.codeGenerator;

import ast.node.Program;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.BinaryExpression;
import ast.node.expression.operators.BinaryOperator;
import ast.node.statement.ArrayDecStmt;
import ast.node.statement.ReturnStmt;
import ast.node.statement.VarDecStmt;
import byteCode.*;
import visitor.Visitor;

import java.util.ArrayList;

public class CodeGenerator extends Visitor<ArrayList> {
    @Override
    public ArrayList<ByteCode> visit(Program program) {
        // TODO
        return null;
    }

    public ArrayList<ByteCode> visit(MainDeclaration main) {
        // TODO
        return null;
    }

    public ArrayList<ByteCode> visit(FuncDeclaration functionDeclaration) {
        return null;
    }

    public ArrayList<ByteCode> visit(VarDecStmt varDecRet) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();

        if (varDecRet.getInitialExpression() == null) {
            res.add(new Iconst(0));
        } else {
            res.addAll(varDecRet.getInitialExpression().accept(this));
        }

        res.add(new Istore(slotOf(varDecRet.getIdentifier())));
        return res;
    }


    public ArrayList<ByteCode> visit(ArrayDecStmt arrayDecRet) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();

        if (arrayDecRet.getArrSize() <= 3) {
            res.add(new Iconst(arrayDecRet.getArrSize())); // TODO
        } else {
            res.add(new Bipush(arrayDecRet.getArrSize()));
        }
        res.add(new Newarray());
        res.add(new Astore(slotOf(arrayDecRet.getIdentifier())));

        if (arrayDecRet.getInitialValues() == null) {
            return res;
        }

        for (int i = 0; i < arrayDecRet.getArrSize(); i++) {
            res.add(new Aload(slotOf(arrayDecRet.getIdentifier())));
            // TODO use dup instead

            if (i <= 3) {
                res.add(new Iconst(i));
            } else {
                res.add(new Bipush(i));
            }

            res.addAll(arrayDecRet.getInitialValues().get(i).accept((this)));
            res.add(new Iastore());
        }
        return res;
    }


    public ArrayList<ByteCode> visit(ReturnStmt returnRet) {
        ArrayList<ByteCode> res = new ArrayList();
        res.add(new Ireturn());
        return res;
    }


    public ArrayList<ByteCode> visit(BinaryExpression e) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();

        res.addAll(e.getLeft().accept(this));
        res.addAll((e.getRight().accept(this)));

        if (e.getBinaryOperator() == BinaryOperator.mult) { // replace MUL
            res.add(new Imul());
        } else if (e.getBinaryOperator() == BinaryOperator.add) {
            res.add(new Iadd());
        } else if (e.getBinaryOperator() == BinaryOperator.sub) {
            res.add(new Isub());
        } else if (e.getBinaryOperator() == BinaryOperator.div) {
            res.add(new Idiv());
        } else if (e.getBinaryOperator() == BinaryOperator.mod) {
            res.add(new Irem());
        }
        return res;
    }

}
