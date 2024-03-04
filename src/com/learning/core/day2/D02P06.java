package com.learning.core.day2;
import java.util.*;
public class D02P06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input week number
        System.out.print("Enter week number (1-7): ");
        int weekNumber = scanner.nextInt();

        // Check and print corresponding weekday
        if (weekNumber >= 1 && weekNumber <= 7) {
            if (weekNumber == 1) {
                System.out.println("Monday");
            } else if (weekNumber == 2) {
                System.out.println("Tuesday");
            } else if (weekNumber == 3) {
                System.out.println("Wednesday");
            } else if (weekNumber == 4) {
                System.out.println("Thursday");
            } else if (weekNumber == 5) {
                System.out.println("Friday");
            } else if (weekNumber == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }
    }

}
