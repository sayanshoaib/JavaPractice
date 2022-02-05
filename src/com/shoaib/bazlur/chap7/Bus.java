package com.shoaib.bazlur.chap7;

public class Bus extends Vehicle {
    int noOfWheels = 6;

    public void printWheels() {
        System.out.println("Number of Wheels in Bus: " + noOfWheels);
        System.out.println("Number of Wheels in Vehicle: " + super.noOfWheels);
    }
}
