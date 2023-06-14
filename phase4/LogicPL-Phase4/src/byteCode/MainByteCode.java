package byteCode;

import byteCode.ISA.ByteCode;

import java.util.ArrayList;

public class MainByteCode {
    private ArrayList<ByteCode> byteCodes_;

    public MainByteCode(ArrayList<ByteCode> byteCodes) {
        byteCodes_ = byteCodes;
    }

    @Override
    public String toString() {
        String res = "Main;\n";
        res += "Code:\n";
        for (ByteCode byteCode : byteCodes_)
            res += "\t" + byteCode.toString() + "\n";
        res += "End Main;\n";
        return res;
    }
}
