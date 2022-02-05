package com.shoaib.JavaDSABootCamp.Lecture8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println("Enter value of n: ");
        int n = input.nextInt();

        while (count <= n) {
            int temp = b; // 1, 1, 2, 3, 5,...
            b = b + a;    // 1, 2, 3, 5, 8,...
            a = temp;     // 1, 1, 2, 3, 5,...
            count++;      // 3, 4, 5, 6, 7,...
        }

        System.out.println(b); // 8,....

    }
}
