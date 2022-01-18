package com.shoaib.JavaDSABootCamp.Lecture9;

import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {18, 12, 9, 14, 77, 50};

        System.out.println("Enter the key value: ");
        int key = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("key is found at index -> " + i);
                break;
            } else {
                System.out.println("Key not found!");
            }
        }


    }
}
