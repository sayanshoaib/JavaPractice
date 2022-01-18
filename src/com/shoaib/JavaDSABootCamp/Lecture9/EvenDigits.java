package com.shoaib.JavaDSABootCamp.Lecture9;

//LeetCode problem no. 1295.

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(564656));
        System.out.println(digits2(5646));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits2(int num) {
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {
        if (num < 0) {
            return num * -1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
