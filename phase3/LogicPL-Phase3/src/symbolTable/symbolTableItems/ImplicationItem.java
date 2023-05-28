package symbolTable.symbolTableItems;

import ast.node.statement.ForloopStmt;
import ast.node.statement.ImplicationStmt;
import symbolTable.SymbolTable;

public class ImplicationItem extends SymbolTableItem {
    protected SymbolTable implicationSymbolTable;
    protected ImplicationStmt implicationStmt;
    private int id;
    private static int globalId;
    public static final String STARTKEY = "Implication_";

    public ImplicationItem(String name) {
        this.name = name;
        setLocalId();
    }

    public ImplicationItem(ImplicationStmt implicationStmt)
    {
        this.name = implicationStmt.toString();
        this.implicationStmt = implicationStmt;
        setLocalId();
        implicationStmt.setId(this.id);
    }

    public Void setImplicationLoopSymbolTable(SymbolTable implicationLoopSymbolTable) {
        this.implicationSymbolTable = implicationLoopSymbolTable;
        return null;
    }

    public SymbolTable getImplicationSymbolTable()
    {
        return this.implicationSymbolTable;
    }

    @Override
    public String getKey() {
        return ImplicationItem.STARTKEY + this.name + this.id;
    }

    private Void setLocalId() {
        this.id = this.globalId;
        this.globalId++;
        return null;
    }
}
