package com.shoaib.bazlur.chap8;

public class PrintExceptionInfo {
    public static void main(String[] args) {
        int a = 5;
        try {
            int result = a / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
