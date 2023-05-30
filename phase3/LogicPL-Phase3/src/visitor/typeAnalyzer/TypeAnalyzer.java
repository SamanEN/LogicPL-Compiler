package visitor.typeAnalyzer;

import ast.node.Program;
import ast.node.declaration.Declaration;
import ast.node.declaration.FuncDeclaration;
import ast.node.declaration.MainDeclaration;
import ast.node.expression.Expression;
import ast.node.expression.FunctionCall;
import ast.node.expression.Identifier;
import ast.node.expression.operators.BinaryOperator;
import ast.node.statement.*;
import ast.type.NoType;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import compileError.CompileError;
import compileError.Type.FunctionNotDeclared;
import compileError.Type.LeftSideNotLValue;
import compileError.Type.UnsupportedOperandType;
import compileError.Type.ConditionTypeNotBool;
import symbolTable.SymbolTable;
import symbolTable.itemException.ItemNotFoundException;
import symbolTable.symbolTableItems.ForLoopItem;
import symbolTable.symbolTableItems.FunctionItem;
import symbolTable.symbolTableItems.ImplicationItem;
import symbolTable.symbolTableItems.MainItem;
import visitor.Visitor;

import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        for (var functionDec : program.getFuncs()) {
            functionDec.accept(this);
        }

        program.getMain().accept(this);

        return null;
    }

    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        try {
            FunctionItem functionItem =
                    (FunctionItem) SymbolTable.root.get(FunctionItem.STARTKEY + funcDeclaration.getName().getName());
            SymbolTable.push((functionItem.getFunctionSymbolTable()));
        } catch (ItemNotFoundException e) {
            //unreachable
        }

        for (var stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainItemSymbolTable(mainSymbolTable);

        SymbolTable.push(mainItem.getMainItemSymbolTable());

        for (var stmt : mainDeclaration.getMainStatements()) {
            stmt.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {
        try {
            ForLoopItem forLoopItem =
                    (ForLoopItem) SymbolTable.root.get(ForLoopItem.STARTKEY + forloopStmt.toString() + forloopStmt.getId());
            SymbolTable.push((forLoopItem.getForLoopSymbolTable()));
            for (Statement stmt : forloopStmt.getStatements())
                stmt.accept(this);
        } catch (ItemNotFoundException e) {
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);
        if (!expressionTypeChecker.isLvalue(assignStmt.getLValue()))
            typeErrors.add(new LeftSideNotLValue(assignStmt.getLine()));
        else if (!expressionTypeChecker.sameType(tl, tr))
            typeErrors.add(new UnsupportedOperandType(assignStmt.getLine(), BinaryOperator.assign.name()));
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        try {
            SymbolTable.root.get(FunctionItem.STARTKEY + functionCall.getUFuncName().getName());
            //TODO can check arg types
            for (Expression argExpr : functionCall.getArgs())
                argExpr.accept(expressionTypeChecker);
        } catch (ItemNotFoundException e) {
            typeErrors.add(new FunctionNotDeclared(functionCall.getLine(), functionCall.toString()));
        }
        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        try {
            ImplicationItem implicationItem =
                    (ImplicationItem) SymbolTable.top.get(ImplicationItem.STARTKEY + implicationStmt.toString() + implicationStmt.getId());
            SymbolTable.push(implicationItem.getImplicationSymbolTable());
        } catch (ItemNotFoundException e) {
        }

        Type conditionType = implicationStmt.getCondition().accept(expressionTypeChecker);
        for (Statement stmt : implicationStmt.getStatements())
            stmt.accept(this);
        if (!(conditionType instanceof BooleanType))
            if (!(conditionType instanceof NoType))
                typeErrors.add(new ConditionTypeNotBool(implicationStmt.getLine()));

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        Type tl = varDecStmt.getType();
        Type tr = new NoType();
        if (varDecStmt.getInitialExpression() != null)
            tr = varDecStmt.getInitialExpression().accept(expressionTypeChecker);
        if (tr instanceof NoType)
            return null;
        if (!expressionTypeChecker.sameType(tl, tr))
            typeErrors.add(new UnsupportedOperandType(varDecStmt.getLine(), BinaryOperator.assign.name()));

        return null;
    }


}
