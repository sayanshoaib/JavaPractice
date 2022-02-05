package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class ElseIfElseExample {
    public static void main(String [] args) {
        int number = 15;
        System.out.println("Guess the Number: ");
        Scanner input = new Scanner(System.in);

        int guess = input.nextInt();

        if (guess == number) {
            System.out.println("Congratulations! " + "You guessed the number correctly.");
        } else if (number > guess) {
            System.out.println("The number is greater than " + guess);
        } else {
            System.out.println("The number is less than " + guess);
        }
    }
}
