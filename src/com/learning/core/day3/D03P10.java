package com.learning.core.day3;

public class D03P10 {
    public static void main(String[] args) {
        String s = "ababab";
        int length = longestNonMatchingPrefixSuffix(s);
        System.out.println("Length of the longest prefix that is also a suffix (and not completely matching): " + length);
    }

    public static int longestNonMatchingPrefixSuffix(String s) {
        int n = s.length();
        int length = 0;

        // Iterate through the string and check prefixes and suffixes
        for (int i = 1; i < n; i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(n - i, n);

            // Check if the prefix and suffix are not completely matching
            if (!prefix.equals(suffix)) {
                length = Math.max(length, i);
            }
        }

        return length;
    }
}
