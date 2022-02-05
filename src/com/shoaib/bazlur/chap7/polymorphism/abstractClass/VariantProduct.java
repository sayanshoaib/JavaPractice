package com.shoaib.bazlur.chap7.polymorphism.abstractClass;

public class VariantProduct extends Product {
    public VariantProduct(String name) {
        super(name);
        System.out.println("Inside subclass");
    }
}
