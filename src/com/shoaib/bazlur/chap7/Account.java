package com.shoaib.bazlur.chap7;

public class Account {
    private long amount;

    public final void deposit(long amount) {
        this.amount += amount;
    }

    public long getAmount() {
        return amount;
    }
}
