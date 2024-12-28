import java.util.Stack;

public class infixtoprefix {

    public static int val(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    public static String prefix(String exp) {

        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.empty() && operators.peek() != '(') {
                    String s1 = operands.pop();
                    String s2 = operands.pop();
                    char op = operators.pop();
                    String temp = op + s2 + s1;
                    operands.push(temp);
                }
                operators.pop();  // pop the '('
            } else if (Character.isLetter(c)) {
                operands.push(String.valueOf(c)); // push the character as a string
            } else {
                while (!operators.isEmpty() && val(c) <= val(operators.peek())) {
                    String s1 = operands.pop();
                    String s2 = operands.pop();
                    char op = operators.pop();
                    String temp = op + s2 + s1;
                    operands.push(temp);
                }
                operators.push(c);
            }
        }

        // Pop remaining operators
        while (!operators.empty()) {
            String s1 = operands.pop();
            String s2 = operands.pop();
            char op = operators.pop();
            String temp = op + s2 + s1;
            operands.push(temp);
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        String exp = "(A-B/C)*(A/K-L)";
        System.out.println(prefix(exp)); // Output: *-A/BC-/AKL
    }
}

