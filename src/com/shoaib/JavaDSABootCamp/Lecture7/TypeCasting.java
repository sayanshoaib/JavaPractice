package com.shoaib.JavaDSABootCamp.Lecture7;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println(num1);

        int num2 = (int)(64.56f);
        System.out.println(num2);

        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        byte j = 4;
        byte k = 5;
        int l = j + k;
        System.out.println(l);
        System.out.println("ভালবাসা");

    }
}
