package com.shoaib.JavaDSABootCamp.Lecture8;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        int k = 1;
        do {
            System.out.println("Hello World");
        } while (k != 1);
    }
}
