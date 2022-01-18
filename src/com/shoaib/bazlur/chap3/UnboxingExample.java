package com.shoaib.bazlur.chap3;

public class UnboxingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UnboxingExample example = new UnboxingExample();
        Integer a = 10;
        Integer b = 15;
        example.add(a, b);
        System.out.println("Sum: " + example.add(a, b));
    }
}
