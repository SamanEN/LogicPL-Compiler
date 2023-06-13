package visitor.codeGenerator;

import ast.node.Program;
import byteCode.ByteCode;
import visitor.Visitor;

import java.util.ArrayList;

public class CodeGenerator extends Visitor<ArrayList> {
    @Override
    public ArrayList<ByteCode> visit(Program program) {
        return null;
    }
}
