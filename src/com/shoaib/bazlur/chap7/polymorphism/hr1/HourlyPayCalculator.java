package com.shoaib.bazlur.chap7.polymorphism.hr1;

import com.shoaib.bazlur.chap7.polymorphism.hr0.Client;

public class HourlyPayCalculator extends PayCalculator{
    private final double hourlyRate;

    public HourlyPayCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPay(Client client) {
        return hourlyRate * client.getHoursWorked();
    }
}
