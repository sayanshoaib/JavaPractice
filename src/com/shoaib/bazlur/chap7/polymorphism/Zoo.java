package com.shoaib.bazlur.chap7.polymorphism;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void printInfo() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println("Diet: " + animal.getDiets());
        }
    }
}
