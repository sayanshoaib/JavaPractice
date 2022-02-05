package com.shoaib.bazlur.chap4;

import java.util.Scanner;

public class USSDOptionSwitch {
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

        switch (number) {
            case 0:
                System.out.println("Downloading MyGP");
                break;
            case 1:
                System.out.println("You don't have sufficient balance, " + "recharge now");
                break;
            case 2:
                System.out.println("Your sounding privileged");
                break;
            case 3:
                System.out.println("1 GB at tk 38");
                System.out.println("5 GB at tk 299");
                break;
            case 4:
                System.out.println("You have 100 minutes free talktime, " + "Use them");
                break;
            case 5:
                System.out.println("You don't have any offer, " + "migrate to another provider!");
                break;
            case 6:
                System.out.println("We are out of service at this moment");
                break;
            default:
                System.out.println("You pressed wrong code");
                break;
        }
    }
}
