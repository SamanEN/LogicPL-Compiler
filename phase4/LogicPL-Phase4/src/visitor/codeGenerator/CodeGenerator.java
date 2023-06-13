package visitor.codeGenerator;

import ast.node.Program;
import byteCode.ByteCode;
import visitor.Visitor;

import java.util.ArrayList;

public class CodeGenerator extends Visitor<ArrayList> {
    @Override
    public ArrayList<ByteCode> visit(Program program) {
        // TODO
        return null;
    }

    public ArrayList<ByteCode> visit(MainDeclaration main) {
        // TODO
        return null;
    }

    public ArrayList<ByteCode> visit(FuncDeclaration functionDeclaration) {
        return null;
    }

    public ArrayList<ByteCode> visit(VarDecStmt varDecRet) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();

        if (varDecRet.getInitialExpression() == null){
            res.add(new Iconst(0));
        }
        else{
            if (varDecRet. <= 3){
                res.add(new Iconst(varDecRet.)); // TODO
            }
            else {
                res.add(new Bipush(varDecRet.));
            }
            
        }
            
        res.add(new Istore(slotOf(varDecRet.getIdentifier())));
        return res;                     
    }


    public ArrayList<ByteCode> visit(ArrayDecStmt arrayDecRet) {
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();
        
        if (arrayDecRet.getArrSize() <= 3){
            res.add(new Iconst(arrayDecRet.getArrSize())); // TODO
        }
        else {
            res.add(new Bipush(arrayDecRet.getArrSize()));
        }
        res.add(new Newarray());
        res.add(new Astore(slotOf(arrayDecRet.getIdentifier())));
        
        if (arrayDecRet.getInitialValues() == null){
            return res;
        }
        
        for (int i=0; i < arrayDecRet.getArrSize(); i++){
            res.add(new Aload(slotOf(arrayDecRet.getIdentifier())));
            
            if (i <= 3){ // write it better if you can
                res.add(new Iconst(i));            
            }
            else {
                res.add(new Bipush(i));
            } 
            
            res.add() // TODO array values
        }
        res.add(new Iastore());
        return res; 
    }

    
    public ArrayList<ByteCode> visit(ReturnStmt returnRet) {
        return new ArrayList(new Ireturn());
    } 


    public ArrayList<ByteCode> visit(BinaryExpression e) { // TODO not sure if it is correct
        ArrayList<ByteCode> res = new ArrayList<ByteCode>();
        
        res.add(new ); // add right value 

        if (e.getBinaryOperator() == MUL){ // replace MUL
            res.add(new Imul());
        }
        else if (e.getBinaryOperator() == PLUS){
            res.add(new Iadd());
        }
        else if (e.getBinaryOperator() == SUB){
            res.add(new Isub());
        }
        else if (e.getBinaryOperator() == DIV){
            res.add(new Idiv());
        }
        else if (e.getBinaryOperator() == REM){
            res.add(new Irem());
        }
        return res; 
    } 

}
