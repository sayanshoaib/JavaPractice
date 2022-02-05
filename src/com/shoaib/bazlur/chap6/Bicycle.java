package com.shoaib.bazlur.chap6;

public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public Bicycle() {
        System.out.println("Bicycle object created");
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
