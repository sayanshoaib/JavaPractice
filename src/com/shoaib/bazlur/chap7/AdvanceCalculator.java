package com.shoaib.bazlur.chap7;

public class AdvanceCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        int r = a + b;
        //Hacker's Delight- 2-13 OVERFLOW DETECTION
        //iff both argument have the opposite sign of the result
        if (((a ^ b) & (b ^ a)) < 0) {
            throw  new ArithmeticException("integer overflow");
        }
        return r;
    }
}
