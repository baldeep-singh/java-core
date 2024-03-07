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

    
        for (String str : dictionary) {
            boolean matchesAllPatterns = true;
            
            for (String pattern : patterns) {
               
                if (!matchesPattern(str, pattern)) {
                    matchesAllPatterns = false;
                    break;
                }
            }
            
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
        for (int i = 0; i < str.length(); i++) {
            if (pattern.charAt(i) != 'x' && pattern.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
