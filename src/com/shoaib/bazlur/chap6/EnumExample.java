package com.shoaib.bazlur.chap6;

public class EnumExample {
    public void displayDay(Day day) {
        if (day == Day.SATURDAY) {
            System.out.println("It's saturday! Weekend!");
        } else if (day == Day.FRIDAY) {
            System.out.println("It's friday!! Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);
        Day[] values = Day.values();
        for (Day day1: values) {
            System.out.println(day1);
        }
    }
}
