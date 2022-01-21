package com.shoaib.bazlur.chap8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = 0;
        do {
           try {
               number = input.nextInt();
               if (number != -1) {
                   System.out.println("You entered: " + number + ", enter another number (-1 exit): ");
               } else {
                   System.out.println("Program exited");
               }
           } catch (InputMismatchException e) {
               e.printStackTrace();
               System.out.println("Please enter only a number: ");
               input.nextLine();
           }
        } while (number != -1);
    }
}
