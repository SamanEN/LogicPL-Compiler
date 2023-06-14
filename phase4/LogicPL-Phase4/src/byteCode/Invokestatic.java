package byteCode;

import ast.node.expression.values.IntValue;
import ast.type.Type;
import ast.type.primitiveType.BooleanType;
import ast.type.primitiveType.IntType;

import java.util.ArrayList;

public class Invokestatic extends ByteCode {
    private ArrayList<Type> argsType_;
    private Type returnType_ = null;
    private String name_;

    public Invokestatic(String name) {
        name_ = name;
    }

    public void addArgType(Type argType) {
        argsType_.add(argType);
    }

    public void setReturnType(Type returnType) {
        returnType_ = returnType;
    }

    //The LogicPL does not support classes. So every function declaration
    //will be translated to a static method inside Main class of JVM.
    @Override
    public String toString() {
        String res = "invokestatic Main/" + name_;
        res += "(";
        for (Type argType : argsType_) {
            if (argType instanceof IntType || argType instanceof BooleanType)
                res += "I";
            else
                res += "F";
        }
        res += ")";
        if (returnType_ == null) {
            res += "V";
        } else if (returnType_ instanceof IntType || returnType_ instanceof BooleanType) {
            res += "I";
        } else {
            res += "F";
        }
        return res;
    }

}
