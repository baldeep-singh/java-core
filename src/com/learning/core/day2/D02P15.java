package com.learning.core.day2;
import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        
        String[] numbers = input.split(" ");
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
