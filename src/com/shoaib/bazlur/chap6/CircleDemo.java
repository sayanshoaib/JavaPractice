package com.shoaib.bazlur.chap6;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        System.out.println("Circle1: " + circle1.getNumberOfObjectCreated());
        System.out.println("Circle2: " + circle2.getNumberOfObjectCreated());
        System.out.println("Circle3: " + circle3.getNumberOfObjectCreated());

    }
}
