package general;

import java.util.Stack;

public class p150_evaluate_reverse_polish_notation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(eval(b, a, token)));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private static int eval(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }

        return -1;
    }
}
