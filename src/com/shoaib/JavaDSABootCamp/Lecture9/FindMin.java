package com.shoaib.JavaDSABootCamp.Lecture9;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};

        System.out.println(findMin(nums));

    }

    static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }
}
