package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");
        
        Stack<Integer> stack = new Stack<>();
        for (String num : numbers) {
            stack.push(Integer.parseInt(num));
        }
        
        boolean isTopEven = isEven(stack.peek());
        System.out.println(isTopEven);
        
        scanner.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
