package com.shoaib.JavaDSABootCamp.Lecture8;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        int salary = 25400;
        if (salary > 20000) {
            salary = salary + 2000;
        }
        else if(salary > 10000){
            salary = salary + 3000;
        }
        else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
