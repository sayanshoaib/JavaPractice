package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class VoterEligibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! " + "You are eligible to vote.");
        }
        else {
            System.out.println("Sorry! You are not eligible to vote." + " Better luck next time");
        }
    }
}
