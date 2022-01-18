package com.shoaib.bazlur.chap6;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person(String name, String email) {
        this(name);
        this.email = email;
    }

    public Person(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("age: " + age);
    }
}
