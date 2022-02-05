package com.shoaib.bazlur.chap7;

public class DogWalker {
    public void walk(Dog dog) {
        if (dog instanceof Poodle) {
            Poodle poodle = (Poodle) dog;
            System.out.println("Walking " + poodle.getName());
        } else {
            System.out.println("Walking " + dog.getBread());
        }
    }
}
