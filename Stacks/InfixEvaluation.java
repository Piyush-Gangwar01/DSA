import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String str = "9-5+3*4/6";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a digit, push it to the value stack
            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            } 
            // If the character is an operator
            else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    val.push(evaluate(v1, v2, operator));
                }
                op.push(ch);
            }
        }

        // Evaluate the remaining operators in the stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            val.push(evaluate(v1, v2, operator));
        }

        // The final result is in the value stack
        System.out.println("Result: " + val.pop());
    }

    // Helper function to determine precedence of operators
    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0; // Default case (should not occur)
    }

    // Helper function to evaluate two values with an operator
    private static int evaluate(int v1, int v2, char op) {
        switch (op) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/': return v1 / v2; // Assuming no division by zero
            default: return 0; // Default case (should not occur)
        }
    }
}
