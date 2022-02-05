package com.shoaib.bazlur.chap7;

public class Order {
    private final Customer customer;
    private final ShoppingCart shoppingCart;
    private final Transaction transaction;

    public Order(Customer customer, ShoppingCart shoppingCart, Transaction transaction) {
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.transaction = transaction;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", shoppingCart=" + shoppingCart +
                ", transaction=" + transaction +
                '}';
    }
}
