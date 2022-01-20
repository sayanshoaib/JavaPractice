package com.shoaib.bazlur.chap7;

public class BMITEST {
    public static void main(String[] args) {
        BMI bmi = new BMI("Tanvir Rifat", 145, 70);
        System.out.println("The BMI for " + bmi.getName() + " is (" + bmi.getBMI() + ") " + bmi.getStatus());
    }
}
