package com.shoaib.bazlur.chap7.polymorphism;

public class CashPayment implements Payment {
    private final double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking cash payment");
        return amount;
    }
}
