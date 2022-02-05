package com.shoaib.JavaDSABootCamp.Lecture8;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the largest: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("b is the largest: " + b);
        } else {
            System.out.println("c is the largest: " + c);
        }

    }
}
