package com.shoaib.bazlur.chap3;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println("Is Even: " + isEven);

    }
}
