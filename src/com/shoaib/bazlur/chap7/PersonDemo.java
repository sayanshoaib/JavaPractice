package com.shoaib.bazlur.chap7;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Shoaib");
        System.out.println(person.getName());
        person.name = "Nur";
        System.out.println(person.name);
    }
}
