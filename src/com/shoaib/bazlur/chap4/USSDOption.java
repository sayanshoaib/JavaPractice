package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class USSDOption {
    public static void main(String[] args) {
        System.out.println("""
                0. Download MyGp
                1. Balance, Call Rate & FnF
                2. GP STAR
                3. Internet Pack
                4. Talk Time/ Minutes Pack
                5. My Offers
                6. Welcome tune
                """);

        System.out.println("Select an option from (0 to 6): ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Downloading MyGP");
        } else if (number == 1) {
            System.out.println("You don't have sufficient balance, " + "recharge now");
        } else if (number == 2) {
            System.out.println("Your sounding privileged");
        } else if (number == 3) {
            System.out.println("1 GB at tk 38");
            System.out.println("5 GB at tk 299");
        } else if (number == 4) {
            System.out.println("You have 100 minutes free talktime, " + "Use them");
        } else if (number == 5) {
            System.out.println("You don't have any offer, " + "migrate to another provider!");
        } else if (number == 6) {
            System.out.println("We are out of service at this moment");
        } else {
            System.out.println("You pressed wrong code");
        }
    }
}
