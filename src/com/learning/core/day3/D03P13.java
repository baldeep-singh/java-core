package com.learning.core.day3;
public class D03P13 {
    public static void main(String[] args) {
        String str = "hello world";
        String replacedStr = replaceSpaces(str);
        System.out.println("Original string: " + str);
        System.out.println("String with spaces replaced: " + replacedStr);
    }

    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
