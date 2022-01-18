package com.shoaib.bazlur.chap6;

public class FlightDemo {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(2, 2);
        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("Total Checked Bags = " + totalCheckedBags);
        int totalPassengers = flight.getTotalPassengers();
        System.out.println("Total Passengers = " + totalPassengers);
    }
}
