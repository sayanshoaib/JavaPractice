package com.shoaib.bazlur.chap3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter value for a: ");
        a = input.nextInt();
        System.out.println("Enter value for b: ");
        b = input.nextInt();
        System.out.println("Enter value for c: ");
        c = input.nextInt();
        System.out.println("Enter value for d: ");
        d = input.nextInt();

        if (a == b && a == c && a == d && b == c && b == d && c == d) {
            System.out.println("All are equal");
        }
        else {
            System.out.println("All are not equal");
        }

    }
}
