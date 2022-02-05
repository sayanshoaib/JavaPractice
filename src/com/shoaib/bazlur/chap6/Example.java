package com.shoaib.bazlur.chap6;

public class Example {
    static int anotherNumber = 10;
    int number = 5;

    public int multiplyWith(int value) {
        return value * anotherNumber * number;
    }
    /*
    public static int subtractWith(int value) {
        return value - number;         // number is a non static field so the static method can not read it.
    }
    */

}
