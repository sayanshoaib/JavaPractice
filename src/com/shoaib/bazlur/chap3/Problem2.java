package com.shoaib.bazlur.chap3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Enter value for a: ");
        a = input.nextInt();
        System.out.println("Enter value for b: ");
        b = input.nextInt();
        System.out.println("Enter value for c: ");
        c = input.nextInt();
        System.out.println("Enter value for d: ");
        d = input.nextInt();
        System.out.println("Enter value for e: ");
        e = input.nextInt();

        double average = (double) (a + b + c + d + e) / 5;

        System.out.println("Average of 5 numbers is: " + average);

    }
}
