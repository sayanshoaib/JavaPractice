package com.shoaib.bazlur.chap7.polymorphism;

public class Lion extends Animal {
    public Lion() {
        super(4, "Lion");
    }


    @Override
    public String getDiets() {
        return "Meat";
    }
}
