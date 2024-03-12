package com.learning.core.day7;
import java.util.Stack;

public class D07P05{
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, element);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, element);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
