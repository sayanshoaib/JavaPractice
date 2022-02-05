package com.shoaib.bazlur.chap8;

public class Calculator {
    public int divide(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException(
                    "Argument b cannot be negative"
            );
        }
        return a / b;
    }
}
