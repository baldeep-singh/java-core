package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        char grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
    }
    
    public static char calculateGrade(double percentage) {
        if (percentage >= 60) {
            return 'A';
        } else if (percentage >= 45) {
            return 'B';
        } else if (percentage >= 35) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
