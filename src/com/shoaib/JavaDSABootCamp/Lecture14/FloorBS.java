package com.shoaib.JavaDSABootCamp.Lecture14;

public class FloorBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4, 15, 16, 18, 22, 45};
        // int[] arr = {99, 80, 75, 22, 11, 10, 8, 6, 3, 1};
        int target = 3;
        int ans = ceilingBS(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    static int ceilingBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        //int ceiling = 0;

        //find whether the array is sorted in ascending order or descending
        boolean isAsc = arr[start] < arr[end];
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //ceiling = mid + 1;
        }

        return end;
    }
}
