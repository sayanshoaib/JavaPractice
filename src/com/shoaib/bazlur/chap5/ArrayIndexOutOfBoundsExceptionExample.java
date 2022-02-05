package com.shoaib.bazlur.chap5;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] nums = new int[10];
        //System.out.println(nums[11]);
        for (int i = 0; i <= nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
