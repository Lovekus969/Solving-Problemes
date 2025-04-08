import java.util.Stack;

public class InfixToPrefixConverter {

    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Function to get the precedence of an operator
    private static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to reverse a string and swap parentheses
    private static String reverseAndSwapParentheses(String expression) {
        StringBuilder result = new StringBuilder();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (c == '(') {
                result.append(')');
            } else if (c == ')') {
                result.append('(');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Function to convert infix expression to postfix
    private static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            // An operator is encountered
            else if (isOperator(c)) {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to convert infix to prefix expression
    public static String infixToPrefix(String infix) {
        // Step 1: Reverse the infix expression and swap parentheses
        String reversedInfix = reverseAndSwapParentheses(infix);

        // Step 2: Convert reversed infix to postfix
        String postfix = infixToPostfix(reversedInfix);

        // Step 3: Reverse the postfix expression to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String infixExpression = "(A+B)*C";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
