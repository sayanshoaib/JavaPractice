package com.shoaib.bazlur.chap7.polymorphism.abstractClass;

//abstract class and abstract method can not be final.
// Because if it's final we can not extend it, and we can not override its methods.
public abstract class Product {
    private String name;

    //Constructors can not be private because we have to call super() from subclass.
    //Methods of abstract class can't be private
    public Product(String name) {
        this.name = name;
        System.out.println("Inside superclass");
    }
}
