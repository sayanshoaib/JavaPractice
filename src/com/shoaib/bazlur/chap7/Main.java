package com.shoaib.bazlur.chap7;

public class Main {
    public static void main(String[] args) {
        Liquid genericLiquid = new Liquid();
        Liquid milk = new Liquid();
        Liquid coffee = new Liquid();

        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}
