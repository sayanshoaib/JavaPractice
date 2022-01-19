package com.shoaib.bazlur.chap7.polymorphism;

public class BkashPayment implements Payment {
    private final double amount;

    public BkashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking Bkash payment");
        return amount;
    }
}
