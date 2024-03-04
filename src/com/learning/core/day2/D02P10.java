package com.learning.core.day2;
import java.util.Scanner;

public class D02P10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        reverseDigits(number);
    }
    
    public static void reverseDigits(int number) {
        System.out.print("Reversed digits: ");
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println();
    }
}
