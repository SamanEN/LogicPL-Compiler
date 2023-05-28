package visitor.typeAnalyzer;

import ast.node.expression.*;
import ast.node.expression.operators.BinaryOperator;
import ast.node.expression.operators.UnaryOperator;
import ast.node.expression.values.BooleanValue;
import ast.node.expression.values.FloatValue;
import ast.node.expression.values.IntValue;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.FloatType;
import ast.type.primitiveType.IntType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.VarNotDeclared;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.ArrayItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.function.Function;

public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;
    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors){
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1, Type el2){
        if (el1 instanceof IntType && el2 instanceof IntType)
            return true;
        if (el1 instanceof FloatType && el2 instanceof FloatType)
            return true;
        if (el1 instanceof BooleanType && el2 instanceof BooleanType)
            return true;
        return false;
    }

    public boolean isLvalue(Expression expr){
        return expr instanceof Variable;
    }


    @Override
    public Type visit(UnaryExpression unaryExpression) {

        Expression uExpr = unaryExpression.getOperand();
        Type expType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();

        if (expType instanceof NoType)
            return new NoType();

        switch (operator) {
            case plus, minus -> {
                if(expType instanceof BooleanType) {
                    typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                    return new NoType();
                }
            }
            case not -> {
                if (!(expType instanceof BooleanType)) {
                    typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                    return new NoType();
                }
            }
        }

        if (expType instanceof FloatType)
            return new FloatType();
        if (expType instanceof IntType)
            return new IntType();
        return new BooleanType();
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type tl = binaryExpression.getLeft().accept(this);
        Type tr = binaryExpression.getRight().accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();

        switch (operator) {
            case eq, neq, gt, gte, lt, lte -> {
                if (tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                if (sameType(tl, tr)) {
                    return new BooleanType();
                }
            }
            case and, or -> {
                if (tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                if (tl instanceof BooleanType && tr instanceof BooleanType)
                    return new BooleanType();
            }
            case add, sub, mult, div, mod -> {
                if (tl instanceof NoType && tr instanceof NoType)
                    return new NoType();
                if (tl instanceof IntType && tr instanceof IntType)
                    return new IntType();
                if (tr instanceof FloatType && tr instanceof FloatType)
                    return new FloatType();
            }
        }
        typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
             VariableItem foundItem = (VariableItem) SymbolTable.top.get(identifier.getName());
             return foundItem.getType();
        } catch (ItemNotFoundException e) {
            typeErrors.add(new VarNotDeclared(identifier.getLine(), identifier.getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(ArrayAccess arrayAccess) {
        try {
            ArrayItem foundItem = (ArrayItem) SymbolTable.top.get(arrayAccess.getName());
            //TODO can check array index type
            return foundItem.getType();
        } catch (ItemNotFoundException e) {
            typeErrors.add(new VarNotDeclared(arrayAccess.getLine(), arrayAccess.getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        try {
            FunctionItem foundItem = (FunctionItem) SymbolTable.top.get(functionCall.getUFuncName().getName());
            //TODO can check args types
            return foundItem.getHandlerDeclaration().getType();
        } catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.getUFuncName().getName()));
            return new NoType();
        }
    }

    @Override
    public Type visit(QueryExpression queryExpression) {
        return new BooleanType();
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatValue value) {
        return new FloatType();
    }

    @Override
    public Type visit(BooleanValue value) {
        return new BooleanType();
    }
}
