package com.shoaib.selfPractice.polymorphism;

public class SuperHero {
    public String name;
    public String power;
    public String universe;

    public void intro() {
        System.out.println("I'm a super hero");
    }

    public String getName(String bruce_wayne) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", universe='" + universe + '\'' +
                '}';
    }
}
