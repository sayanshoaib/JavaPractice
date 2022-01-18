package com.shoaib.bazlur.chap5;

import java.util.Arrays;

public class DefaultValueOfArray {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println("ints = " + Arrays.toString(ints));
        Integer[] integers = new Integer[5];
        System.out.println("integers = " + Arrays.toString(integers));
        float[] floats = new float[5];
        System.out.println("floats = " + Arrays.toString(floats));
        char[] chars = new char[5];
        System.out.println("chars = " + Arrays.toString(chars));
        byte[] bytes = new byte[5];
        System.out.println("bytes = " + Arrays.toString(bytes));
    }
}
