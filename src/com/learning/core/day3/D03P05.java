package com.learning.core.day3;
import java.util.ArrayList;
import java.util.List;

public class D03P05
{

    public static List<String> findConsecutivePairs(int[] nums, int k) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + k <= nums.length) {
                StringBuilder pair = new StringBuilder();
                for (int j = i; j < i + k; j++) {
                    pair.append(nums[j]);
                    if (j < i + k - 1) {
                        pair.append(" ");
                    }
                }
                result.add(pair.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        List<String> pairs = findConsecutivePairs(arr, k);
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}