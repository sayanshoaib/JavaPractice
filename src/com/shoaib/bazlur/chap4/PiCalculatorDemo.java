package com.shoaib.bazlur.chap4;

public class PiCalculatorDemo {
    public static void main(String[] args) {
        PiCalculator piCalculator = new PiCalculator();
        var pi = piCalculator.calculate(100_000);
        System.out.println("Pi = " + pi);
    }
}
