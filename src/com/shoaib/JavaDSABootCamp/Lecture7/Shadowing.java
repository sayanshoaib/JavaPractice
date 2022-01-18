package com.shoaib.JavaDSABootCamp.Lecture7;

public class Shadowing {
    static int x = 90;  //this will be shadowed at line 6.
    public static void main(String[] args) {
        x = 10;
        System.out.println(x);
        fun();
    }

    static void fun() {
        x = 20;
        int prime = 7;
        System.out.println(x + prime);
    }
}
