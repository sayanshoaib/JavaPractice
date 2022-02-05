package com.shoaib.bazlur.chap9;

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<String> cities = new GenericStack<>();

        cities.push("Dhaka");
        cities.push("Toronto");
        cities.push("Barisal");
        cities.push("Paris");
        cities.push("Tallin");

        cities.pop();
        cities.printElements();
        cities.pop();
        cities.printElements();
    }
}
