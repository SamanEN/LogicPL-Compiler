package symbolTable.symbolTableItems;

import ast.node.statement.ForloopStmt;
import ast.node.statement.ImplicationStmt;
import symbolTable.SymbolTable;

public class ImplicationItem extends SymbolTableItem {
    protected SymbolTable implicationSymbolTable;
    protected ImplicationStmt implicationStmt;
    public static final String STARTKEY = "Implication_";

    public ImplicationItem(String name) {
        this.name = name;
    }

    public ImplicationItem(ImplicationStmt implicationStmt)
    {
        this.name = implicationStmt.toString();
        this.implicationStmt = implicationStmt;
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
        return ImplicationItem.STARTKEY + this.name;
    }
}
