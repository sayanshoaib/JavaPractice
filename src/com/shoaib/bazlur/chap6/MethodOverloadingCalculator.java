package com.shoaib.bazlur.chap6;

public class MethodOverloadingCalculator {
    public int performAddition(int a, int b) {
        int result = a + b;
        return result;
    }

    public float performAddition(float a, float b) {
        float result = a + b;
        return result;
    }

    public double performAddition(double a, double b) {
        double result = a + b;
        return result;
    }
}
