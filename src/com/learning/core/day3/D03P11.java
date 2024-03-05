package com.learning.core.day3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03P11{
    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
        String[] patterns = {"xyy", "abb"};

        List<String> matchingStrings = findMatchingStrings(dictionary, patterns);
        System.out.println("Strings matching all patterns:");
        for (String str : matchingStrings) {
            System.out.println(str);
        }
    }

    public static List<String> findMatchingStrings(String[] dictionary, String[] patterns) {
        List<String> matchingStrings = new ArrayList<>();

        // Iterate over each string in the dictionary
        for (String str : dictionary) {
            boolean matchesAllPatterns = true;
            // Iterate over each pattern
            for (String pattern : patterns) {
                // Check if the current string matches the current pattern
                if (!matchesPattern(str, pattern)) {
                    matchesAllPatterns = false;
                    break; // If the string doesn't match, no need to check further patterns
                }
            }
            // If the string matches all patterns, add it to the list of matching strings
            if (matchesAllPatterns) {
                matchingStrings.add(str);
            }
        }

        return matchingStrings;
    }

    public static boolean matchesPattern(String str, String pattern) {
        if (str.length() != pattern.length()) {
            return false;
        }
        // Iterate over each character in the pattern and check if the corresponding character in the string matches
        for (int i = 0; i < str.length(); i++) {
            if (pattern.charAt(i) != 'x' && pattern.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
