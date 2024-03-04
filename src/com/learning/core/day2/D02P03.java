package com.learning.core.day2;
import java.util.*;

public class D02P03 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        double result = 0; // Initialize result variable
        
        switch(operator)
        {
            case '+' :
                result = a + b;
                break; // Add break statement
            case '-' :
                result = a - b;
                break; // Add break statement
            case '*':
                result = a * b;
                break; // Add break statement
            case '/' :
                if (b != 0) {
                    result = (double) a / b; // Perform double division to get a double result
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break; // Add break statement
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        System.out.println("Result: " + result); // Print the result
    }
}
