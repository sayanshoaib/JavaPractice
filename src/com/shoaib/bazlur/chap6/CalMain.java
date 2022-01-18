package com.shoaib.bazlur.chap6;

public class CalMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.performAddition(4, 5));
        calculator.performSubtraction(9, 4);
    }
}
