package LocalVarsArray;

import java.util.ArrayList;

public class LocalVars {
    public ArrayList<String> varDec = new ArrayList<String>();


    public void pushVar(String varName) {
        varDec.add(varName);
    }

    public int slotOf(String varName) {
        return varDec.indexOf(varName);
    }

    public void removeVar(String varName){
            varDec.remove(varName);
    }
}
