package ast.node.expression;

import ast.type.Type;
import ast.node.statement.Statement;

public abstract class Expression extends Statement {
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}