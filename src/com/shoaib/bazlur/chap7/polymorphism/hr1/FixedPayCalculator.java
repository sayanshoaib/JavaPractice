package com.shoaib.bazlur.chap7.polymorphism.hr1;

import com.shoaib.bazlur.chap7.polymorphism.hr0.Client;

public class FixedPayCalculator extends PayCalculator {
    private double fixedPay;

    public FixedPayCalculator(double fixedPay) {
        this.fixedPay = fixedPay;
    }

    @Override
    public double getPay(Client client) {
        return fixedPay;
    }
}
