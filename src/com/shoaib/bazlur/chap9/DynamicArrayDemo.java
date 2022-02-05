package com.shoaib.bazlur.chap9;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> numbers = new DynamicArray<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        int totalElements = numbers.size();
        System.out.println("totalElements = " + totalElements);

        DynamicArray<String> cities = new DynamicArray<>(5);
        cities.add("Dhaka");
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Beijing");
        cities.add("Tokyo");
        cities.add("Sao Paulo");
        System.out.println(cities);
    }
}
