package com.shoaib.JavaDSABootCamp.Lecture9;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        /*
        if (fruit.equals("mango")) {
            System.out.println("King of fruit");
        }

        if (fruit.equals("apple")) {
            System.out.println("a sweet red fruit");
        }

        if (fruit.equals("jackfruit")) {
            System.out.println("National food of bangladesh");
        }

         */

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Favourite Fruit");
            default:
                System.out.println("Unknown Fruit");
        }
    }
}
