package com.shoaib.bazlur.chap3;

public class NumberSystemConversion {
    public static void main(String[] args) {
        int number = 1_000_000; // 1 millon

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("Binary: " + binary);
        System.out.println("Hex: " + hex);
        System.out.println("Octal: " + octal);
    }
}
