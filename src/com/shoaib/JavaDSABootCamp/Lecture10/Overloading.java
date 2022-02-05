package com.shoaib.JavaDSABootCamp.Lecture10;

public class Overloading {
    public static void main(String[] args) {
        fun(18);
        fun("Shoaib");
        System.out.println(sum(5, 4));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void fun(int a) {
        System.out.println("Dob: " + a);
    }

    static void fun(String name) {
        System.out.println("Name: " +name);
    }


}
