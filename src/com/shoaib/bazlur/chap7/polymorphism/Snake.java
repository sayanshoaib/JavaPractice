package com.shoaib.bazlur.chap7.polymorphism;

public class Snake extends Animal {
    public Snake() {
        super(0, "Snake");
    }

    public String getDiets() {
        return "Rats";
    }

}
