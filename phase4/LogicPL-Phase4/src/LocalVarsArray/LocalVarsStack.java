package LocalVarsArray;


public class LocalVarsStack {

    public static LocalVars top;
    public static LocalVars root;

    private static Stack<LocalVars> stack = new Stack<LocalVars>();

    public static void push(LocalVars localVar) {
        if(top != null)
            stack.push(top);
        top = localVar;
    }

    public static void pop() {
        top = stack.pop();
    }
}
