package LocalVarsArray;

import java.util.ArrayList;

public class LocalVars {
    public static ArrayList<String> varDec = new ArrayList<String>();


    public static void pushVar(String varName) {
        varDec.add(varName);
    }

    public static int slotOf(String varName) {
        return varDec.indexOf(varName);
    }

    public static void removeVar(String varName){
            varDec.remove(varName);
    }
}
