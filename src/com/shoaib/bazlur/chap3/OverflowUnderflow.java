package com.shoaib.bazlur.chap3;

public class OverflowUnderflow {
    public static void main(String[] args) {
        int a = 2_147_483_647;
        a = a + 1;
        System.out.println(a);

        int b = -2_147_483_648;
        b = b - 1;
        System.out.println(b);

        double d = Double.MAX_VALUE * 2;
        System.out.println(a);

        long longMax = Long.MAX_VALUE;
        System.out.println(longMax);
        long longMin = Long.MIN_VALUE;
        System.out.println(longMin);
    }
}
