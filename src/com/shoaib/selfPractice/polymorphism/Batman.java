package com.shoaib.selfPractice.polymorphism;

public class Batman extends SuperHero{
    public String name;
    public int age;
    public String mission;

    //Method Overriding
    public void intro() {
        System.out.println("I'm Batman");
    }

    //Method Overloading
    public void intro(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("I'm Batman" + i);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
