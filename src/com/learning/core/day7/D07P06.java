package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");
        
        Stack<Integer> stack = new Stack<>();
        for (String num : numbers) {
            stack.push(Integer.parseInt(num));
        }
        
        int min = findMinimum(stack);
        System.out.println("Minimum value in the stack: " + min);
        
        scanner.close();
    }

    public static int findMinimum(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }

        Stack<Integer> minStack = new Stack<>();
        minStack.push(stack.peek());

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < minStack.peek()) {
                minStack.push(current);
            }
        }

        return minStack.peek();
    }
}
