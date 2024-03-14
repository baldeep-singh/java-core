package com.learning.core.day9;
import java.util.Scanner;

public class D09P01{
    
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    

    static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Perform Quick Sort
        quickSort(arr, 0, n - 1);
        
        // Display the sorted array
        System.out.println("Sorted array:");
        displayArray(arr);
        
        scanner.close();
    }
}
