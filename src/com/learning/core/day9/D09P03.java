package com.learning.core.day9;
import java.util.Scanner;

public class D09P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        
 
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                found = true;
                break;
            }
        }
        

        if (found) {
            System.out.println("Element is present.");
        } else {
            System.out.println("Element is not present.");
        }
        
        scanner.close();
    }
}
