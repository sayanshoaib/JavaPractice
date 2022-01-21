package com.shoaib.JavaDSABootCamp.Lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        /*
        list.add(67);
        list.add(17);
        list.add(45);
        list.add(65);
        list.add(98);
        list.add(12);
        list.add(43);
        list.add(23);
        list.add(75);

        System.out.println(list.contains(75));

        list.set(0, 99);
        list.remove(3);
        System.out.println(list);

         */

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
