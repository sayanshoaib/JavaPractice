package com.shoaib.JavaDSABootCamp.Lecture8;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr, 0, 4));
    }

    static int max(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }

        int MAX = arr[start];

        for (int i = 1; i < end; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        return MAX;
    }
}
