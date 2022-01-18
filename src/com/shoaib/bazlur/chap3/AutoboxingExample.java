package com.shoaib.bazlur.chap3;

public class AutoboxingExample {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        AutoboxingExample example = new AutoboxingExample();
        int a = 5;
        int b = 10;
        example.add(a, b);
        System.out.println("Sum: " + example.add(a, b));
    }
}
