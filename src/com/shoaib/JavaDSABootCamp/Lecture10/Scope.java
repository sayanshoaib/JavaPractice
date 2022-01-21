package com.shoaib.JavaDSABootCamp.Lecture10;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 30;
            int l = 20;
            System.out.println(l + " " + a);
        }

        for (int i = 0; i < a; i++) {
            i = i + a;
            System.out.println(i);
        }

    }

    static void random() {
        int num = 10;
        System.out.println(num);
    }
}
