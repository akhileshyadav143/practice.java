import java.util.*;

public class infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 1. If it's a number, push to values stack
            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0');
            } 
            // 2. If it's an operator
            else {
                // While the operator on top of stack has HIGHER or EQUAL precedence, evaluate it first
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    val.push(applyOp(v1, v2, operator));
                }
                // Push current operator to stack
                op.push(ch);
            }
        }

        // 3. Clear out remaining operators left in the stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            val.push(applyOp(v1, v2, operator));
        }

        // The final result is the last element in the value stack
        System.out.println("Result of " + str + " = " + val.peek());
    }

    // Helper method to define Operator Precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Helper method to perform the math operation
    public static int applyOp(int v1, int v2, char op) {
        if (op == '+') return v1 + v2;
        if (op == '-') return v1 - v2;
        if (op == '*') return v1 * v2;
        if (op == '/') return v1 / v2;
        return 0;
    }
}