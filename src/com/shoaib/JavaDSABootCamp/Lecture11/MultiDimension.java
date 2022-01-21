package com.shoaib.JavaDSABootCamp.Lecture11;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[][] arr = new int[3][0];
        /*
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
         */

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  //no of rows

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        /*
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

         */

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


    }
}
