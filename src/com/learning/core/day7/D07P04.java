package com.learning.core.day7;
import java.util.Stack;

public class D07P04 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String input = "10+(5*2)";
        int result = evaluateExpression(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
