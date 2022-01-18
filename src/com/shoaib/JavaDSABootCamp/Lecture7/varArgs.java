package com.shoaib.JavaDSABootCamp.Lecture7;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 85, 344, 34, 39);
        //multiple(2, 3, "Shoaib", "Nur");
    }

    static void multiple(int a, int b, int ...v) {
        System.out.println();
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
