package visitor.nameAnalyzer;

import ast.node.Program;
import ast.node.declaration.*;
import ast.node.statement.*;
import compileError.*;
import compileError.Name.*;
import main.grammar.LogicPLParser;
import symbolTable.SymbolTable;
import symbolTable.symbolTableItems.*;
import symbolTable.itemException.ItemAlreadyExistsException;
import symbolTable.symbolTableItems.VariableItem;
import visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (FuncDeclaration functionDeclaration : program.getFuncs()) {
            functionDeclaration.accept(this);
        }

        for (var stmt : program.getMain().getMainStatements()) {
            if(stmt instanceof VarDecStmt) {
                stmt.accept(this);
            }
        }

        return null;
    }


    @Override
    public Void visit(FuncDeclaration funcDeclaration) {
        var functionItem = new FunctionItem(funcDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, funcDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(functionSymbolTable);

        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new FunctionRedefinition(funcDeclaration.getLine(), funcDeclaration.getName().getName()));
        }

        SymbolTable.push(functionSymbolTable);

        for (ArgDeclaration varDeclaration : funcDeclaration.getArgs()) {
                varDeclaration.accept(this);
        }

        for (var stmt : funcDeclaration.getStatements()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public  Void visit(AssignStmt assignStmt) {
        return null;
    }

    @Override
    public Void visit(PredicateStmt predicateStmt) {
        return null;
    }

    @Override
    public Void visit(ImplicationStmt implicationStmt) {
        SymbolTable currentTable = SymbolTable.top;
        for(Statement statement : implicationStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        return null;
    }

    @Override
    public Void visit(PrintStmt printStmt) {
        return null;
    }

    @Override
    public Void visit(ForloopStmt forloopStmt) {
        SymbolTable forTable = new SymbolTable(SymbolTable.top, "forLoop" + forloopStmt.getLine());
        SymbolTable.push(forTable);
        for(Statement statement : forloopStmt.getStatements()) {
            statement.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ArgDeclaration argDeclaration) {
        var argItem = new VariableItem(argDeclaration.getIdentifier().getName(), argDeclaration.getType());

        SymbolTable currentTable = SymbolTable.top;
        try {
            currentTable.put(argItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new VariableRedefinition(argDeclaration.getLine(), argDeclaration.getIdentifier().getName()));
        }
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDeclaration) {
        var variableItem = new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType());

        SymbolTable currentTable = SymbolTable.top;
        try {
            currentTable.put(variableItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
        }
        return null;
    }

    @Override
    public Void visit(ArrayDecStmt arrayDecStmt) {
        var variableItem = new VariableItem(arrayDecStmt.getIdentifier().getName(), arrayDecStmt.getType());

        SymbolTable currentTable = SymbolTable.top;
        try {
            currentTable.put(variableItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new VariableRedefinition(arrayDecStmt.getLine(), arrayDecStmt.getIdentifier().getName()));
        }
        return null;
    }
}

