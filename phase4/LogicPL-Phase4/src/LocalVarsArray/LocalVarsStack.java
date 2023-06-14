package LocalVarsArray;


import java.util.Stack;

public class LocalVarsStack {

    public static LocalVars top;
    public static LocalVars root;

    private static Stack<LocalVars> stack = new Stack<>();

    public static void push(LocalVars localVar) {
        if (root == null)
            root = localVar;
        stack.push(top);
        top = localVar;
    }

    public static void pop() {
        stack.pop();
        top = stack.peek();
    }
}
