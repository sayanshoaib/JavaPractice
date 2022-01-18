package com.shoaib.JavaDSABootCamp.Lecture9;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 14;
        int ans = linearSearch(nums, target);
        System.out.println("target found at index: " + ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}
