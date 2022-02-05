package com.shoaib.bazlur.chap9;

public class Car<Name, Model, Price> {
    private final Name name;
    private final Model model;
    private final Price price;

    public Car(Name name, Model model, Price price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Name getName() {
        return name;
    }

    public Model getModel() {
        return model;
    }

    public Price getPrice() {
        return price;
    }

    public void showTypes() {
        System.out.println("Type of Name: " + name.getClass().getName() + " and value: " + name);
        System.out.println("Type of Model: " + model.getClass().getName() + " and value: " + model);
        System.out.println("Type of Model: " + price.getClass().getName() + " and value: " + price);
    }
}
