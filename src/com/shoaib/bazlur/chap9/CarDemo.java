package com.shoaib.bazlur.chap9;

public class CarDemo {
    public static void main(String[] args) {
        Car<String, String, Integer> car1 = new Car<>("BMW", "I8", 20000);
        Car<String, String, Integer> car2 = new Car<>("Tesla", "A6", 80000);
        car1.showTypes();
        car2.showTypes();
    }
}
