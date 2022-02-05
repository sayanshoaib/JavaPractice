package com.shoaib.bazlur.chap5;

import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 5, 6, 9};
        int[] copyArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[i];
            System.out.println(copyArray[i]);
        }

        int[] rangeArr = Arrays.copyOfRange(copyArray, 1, 4);
        System.out.println(Arrays.toString(rangeArr));

        int[] copiedArr =Arrays.copyOf(myArray, 10);
        for (int i = 0; i < copiedArr.length; i++) {
            System.out.print(copiedArr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(copiedArr));


    }
}
