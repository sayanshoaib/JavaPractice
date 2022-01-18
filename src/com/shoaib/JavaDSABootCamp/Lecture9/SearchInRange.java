package com.shoaib.JavaDSABootCamp.Lecture9;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 14;
        int start = 0;
        int end = 6;
        int ans = linearSearch(nums, target, start, end);
        System.out.println("target found at index: " + ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i = start; i < end; i++) {

            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}
