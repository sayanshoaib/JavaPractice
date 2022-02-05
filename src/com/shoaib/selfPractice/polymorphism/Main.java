package com.shoaib.selfPractice.polymorphism;

public class Main {
    public static void main(String[] args) {
        SuperHero ironman = new SuperHero();
        ironman.setName("IronMan");
        ironman.setPower("Superhuman strength, speed, durability, agility");
        ironman.setUniverse("MCU");

        ironman.intro();
        System.out.println(ironman.toString());

        Batman batman = new Batman();
        batman.intro();
        batman.setName("Robert Pattinson");
        System.out.println("Charater Played by: " + batman.getName());
        batman.intro(3);

    }
}
