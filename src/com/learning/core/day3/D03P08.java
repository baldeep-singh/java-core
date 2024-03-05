package com.learning.core.day3;
public class D03P08 {
    public static void main(String[] args) {
        String str = "abbca";
        int deletions = minDeletionsForPalindrome(str);
        System.out.println("Minimum deletions to make \"" + str + "\" palindrome: " + deletions);
    }

    public static int minDeletionsForPalindrome(String str) {
        int n = str.length();
        int deletions = 0;

        // Iterate through the string from both ends
        for (int i = 0, j = n - 1; i < j; ) {
            // If characters at both ends are different, increment deletion count
            if (str.charAt(i) != str.charAt(j)) {
                deletions++;
                // Move pointer from the right end towards the left
                if (str.charAt(i + 1) == str.charAt(j)) {
                    i++;
                }
                // Move pointer from the left end towards the right
                else if (str.charAt(i) == str.charAt(j - 1)) {
                    j--;
                }
                // If neither of the characters can match, choose either side and increment deletion count
                else {
                    i++;
                    j--;
                }
            }
            // If characters match, move both pointers towards the center
            else {
                i++;
                j--;
            }
        }

        return deletions;
    }
}
