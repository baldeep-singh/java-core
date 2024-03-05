package com.learning.core.day3;
public class D03P04
{
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6}; // Example array, you can replace it with your array

        int[] seen = new int[100000]; // Assuming the maximum value of elements in the array is 100000
        int firstRepeatingIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (seen[element] != 0) {
                firstRepeatingIndex = seen[element] - 1; // Adjusting index to 0-based
                break;
            } else {
                seen[element] = i + 1; // Storing index (adding 1 to avoid confusion with initial value 0)
            }
        }

        if (firstRepeatingIndex != -1) {
            System.out.println("Index of the first repeating element: " + firstRepeatingIndex);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}
