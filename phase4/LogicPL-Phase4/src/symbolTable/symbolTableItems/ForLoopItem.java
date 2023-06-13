package symbolTable.symbolTableItems;

import ast.node.statement.ForloopStmt;
import symbolTable.SymbolTable;

public class ForLoopItem extends SymbolTableItem{
    protected SymbolTable ForLoopSymbolTable;
    protected ForloopStmt forloopStmt;
    private int id;
    private static int globalId = 0;
    public static final String STARTKEY = "ForLoop_";

    public ForLoopItem(String name) {
        setLocalID();
        this.name = name;
    }

    public ForLoopItem(ForloopStmt forloopStmt)
    {
        setLocalID();
        this.name = forloopStmt.toString();
        this.forloopStmt = forloopStmt;
        forloopStmt.setId(this.id);
    }

    public Void setForLoopSymbolTable(SymbolTable forLoopSymbolTable) {
        this.ForLoopSymbolTable = forLoopSymbolTable;
        return null;
    }

    public SymbolTable getForLoopSymbolTable()
    {
        return this.ForLoopSymbolTable;
    }

    @Override
    public String getKey() {
        return ForLoopItem.STARTKEY + this.name + this.id;
    }

    private Void setLocalID() {
        this.id = this.globalId;
        this.globalId++;
        return null;
    }
}
