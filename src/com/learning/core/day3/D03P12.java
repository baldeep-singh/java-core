package com.learning.core.day3;
import java.util.HashSet;
import java.util.Set;

public class D03P12 {
    public static void main(String[] args) {
        String str = "applebananaorange";
        boolean canSplit = canSplitIntoDistinctStrings(str);
        System.out.println("Can the string be split into four distinct strings? " + canSplit);
    }

    public static boolean canSplitIntoDistinctStrings(String str) {
        int n = str.length();

        // Check if the length of the string is divisible by 4
        if (n % 4 != 0) {
            return false;
        }

        // Initialize a set to store substrings
        Set<String> substrings = new HashSet<>();

        // Divide the string into four equal parts
        int partLength = n / 4;
        for (int i = 0; i < n; i += partLength) {
            String substring = str.substring(i, i + partLength);
            // Check if the substring is already present in the set
            if (substrings.contains(substring)) {
                return false; // If duplicate substring found, return false
            }
            substrings.add(substring);
        }

        return true;
    }
}
