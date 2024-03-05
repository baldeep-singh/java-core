package com.learning.core.day3;
import java.util.Scanner;

public class D03P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        String vowels = "aeiouAEIOU";
        int count = 0;
        StringBuilder lastNVowels = new StringBuilder();

        for (int i = input.length() - 1; i >= 0 && count < n; i--) {
            char ch = input.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                lastNVowels.insert(0, ch);
                count++;
            }
        }

        if (count < n) {
            System.out.println("Mismatch vowels");
        } else {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }
    }
}
