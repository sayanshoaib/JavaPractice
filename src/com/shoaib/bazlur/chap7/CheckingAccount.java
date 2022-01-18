package com.shoaib.bazlur.chap7;

public class CheckingAccount {
    private final String accountNumber;
    private int balance;

    public CheckingAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Depositing " + amount + " into account " + accountNumber);
        System.out.println("New balance: " + balance);
        System.out.println();
    }

    public void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);

        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("New balance: " + balance);
        }
        System.out.println("");
    }

    public int getBalance() {
        return balance;
    }
}
