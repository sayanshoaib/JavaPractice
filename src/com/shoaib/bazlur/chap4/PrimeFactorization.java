package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();

        System.out.print("Prime factors of " + n + " are: ");

        for (int i = 2; i < n / i; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
