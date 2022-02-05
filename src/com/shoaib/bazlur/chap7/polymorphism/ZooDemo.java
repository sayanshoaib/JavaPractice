package com.shoaib.bazlur.chap7.polymorphism;

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Lion();
        animals[2] = new Snake();

        Zoo zoo = new Zoo(animals);
        zoo.printInfo();
    }
}
