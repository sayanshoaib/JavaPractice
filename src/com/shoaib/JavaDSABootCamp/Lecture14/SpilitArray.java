package com.shoaib.JavaDSABootCamp.Lecture14;

// https://leetcode.com/problems/split-array-largest-sum/

public class SpilitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  //in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you can't add this in this subarray, make new one
                    // say you add this sum in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }

                if (pieces > m) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }

        return end;
    }
}
