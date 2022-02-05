package com.shoaib.JavaDSABootCamp.Lecture9;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();


    }

    private static void extracted(int empID, String department) {
        switch (empID) {
            case 1:
                System.out.println("Shoaib Hasan");
                break;
            case 2:
                System.out.println("Nur");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managemnt Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("No employee");
        }
    }
}
