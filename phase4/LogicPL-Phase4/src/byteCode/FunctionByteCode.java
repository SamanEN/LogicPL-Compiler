package byteCode;

import ast.type.Type;
import byteCode.ISA.ByteCode;

import java.util.ArrayList;

public class FunctionByteCode {
    private ArrayList<ByteCode> byteCodes_;
    private String name_;
    private Type returnType_;
    private ArrayList<Type> argsTypes_;

    public FunctionByteCode(ArrayList<ByteCode> byteCodes, String name, Type returnType, ArrayList<Type> argsTypes) {
        byteCodes_ = byteCodes;
        name_ = name;
        returnType_ = returnType;
        argsTypes_ = argsTypes;
    }

    @Override
    public String toString() {
        String res = "";
        res += returnType_.toString();
        res += " ";
        res += name_;
        res += argsTypes_.toString();
        res += ";\n";
        res += "Code:\n";
        for(ByteCode byteCode : byteCodes_)
            res += "\t" + byteCode.toString() + "\n";
        res += "End Method;\n";
        return res;
    }
}
