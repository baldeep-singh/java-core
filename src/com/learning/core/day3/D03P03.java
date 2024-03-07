package com.learning.core.day3;
import java.util.Arrays;

public class D03P03
{
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {3, 2, 4, 5, 6, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0,0,0};

        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
        }
        array[15] = sum;

        double average = (double) sum / 15;
        array[16] = (int) average;

       
        int smallest = array[0];
        for (int i = 1; i < 15; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        array[17] = smallest;

    
        System.out.println("Updated Array: " + Arrays.toString(array));
    }
}
