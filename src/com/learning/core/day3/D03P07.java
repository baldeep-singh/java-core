package com.learning.core.day3;
import java.util.ArrayList;
import java.util.List;

public class D03P07 {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsequences = generateSubsequences(str);
        System.out.println("All subsequences of \"" + str + "\":");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static List<String> generateSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequencesHelper(str, 0, "", subsequences);
        return subsequences;
    }

    private static void generateSubsequencesHelper(String str, int index, String current, List<String> subsequences) {
        if (index == str.length()) {
            subsequences.add(current);
            return;
        }

        // Include current character
        generateSubsequencesHelper(str, index + 1, current + str.charAt(index), subsequences);

        // Exclude current character
        generateSubsequencesHelper(str, index + 1, current, subsequences);
    }
}
