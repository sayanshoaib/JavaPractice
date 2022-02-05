package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number + " Times Table: ");

        int counter = 1;
        while (counter <= 10) {
            System.out.println(number + "X" + counter + " = " + (counter * number));
            counter++;
        }
    }
}
