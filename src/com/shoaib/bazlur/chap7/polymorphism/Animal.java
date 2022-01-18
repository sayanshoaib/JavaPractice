package com.shoaib.bazlur.chap7.polymorphism;
//Abstract class cannot be instantiated. But can extend and have sub-classes.
public abstract class Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }


    public abstract String getDiets();

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                '}';
    }
}
