package com.learning.core.day3;
import java.util.Arrays;

public class D03P03
{
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {3, 2, 4, 5, 6, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0,0,0};

        // Compute the sum of elements from index 0 to 14 and store it in the 15th index
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
        }
        array[15] = sum;

        // Compute the average of all numbers and store it in the 16th index
        double average = (double) sum / 15;
        array[16] = (int) average;

        // Find the smallest number and store it in the 17th index
        int smallest = array[0];
        for (int i = 1; i < 15; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        array[17] = smallest;

        // Print the updated array
        System.out.println("Updated Array: " + Arrays.toString(array));
    }
}
