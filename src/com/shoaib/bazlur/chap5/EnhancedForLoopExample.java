package com.shoaib.bazlur.chap5;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 4, 6, -5, 0, 15};
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
