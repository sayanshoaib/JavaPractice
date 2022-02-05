package com.shoaib.JavaDSABootCamp.Lecture7;

import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int rollno = input.nextInt();
        System.out.println("Your roll number: " + rollno);

        int money = 456_000_000;
        System.out.println("Prize Money: " + money);

    }
}
