package com.shoaib.JavaDSABootCamp.Lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 454;
        arr[4] = 459;

        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        /*
        for (int num : arr) {
            System.out.println(num + " ");
        }

         */

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Nowshin";

        System.out.println(Arrays.toString(str));
    }
}
