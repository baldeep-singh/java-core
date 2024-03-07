package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the one-dimensional array
        int[] oneDimArray = {10, 20, 30, 40, 50}; 

        
        System.out.print("Enter the first number (1-40): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (1-40): ");
        int num2 = scanner.nextInt();

        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int i = 0; i < oneDimArray.length; i++) {
            if (oneDimArray[i] == num1) {
                foundNum1 = true;
            }
            if (oneDimArray[i] == num2) {
                foundNum2 = true;
            }
        }

        // Display the result
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not found");
        }

        scanner.close();
    }
}
