package com.shoaib.bazlur.chap3;

import java.util.Scanner;

public class ExpressionSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, a, b;
        System.out.println("Enter value of x: ");
        x = input.nextInt();
        System.out.println("Enter value of y: ");
        y = input.nextInt();
        System.out.println("Enter value of a: ");
        a = input.nextInt();
        System.out.println("Enter value of b: ");
        b = input.nextInt();

        double result = (x - 5) / 2.0 + 2 * ((55 - y) / (double) a - (b + 9) / (double) y) / 2.5 + 42;
        System.out.println("result = " + result);
    }
}
