package com.shoaib.bazlur.chap7;

public class Demo {
    public static void main(String[] args) {
        /*
        ShoppingCart shoppingCart = new ShoppingCart();

        Product keyboard = new Product("Mechanical Gaming Keyboard", 48);
        Product mouse = new Product("Gaming Mouse", 48);
        Product ecoDot = new Product("Eco Dot (4th Generation)", 40);

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        System.out.println("ShoppingCart = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("Total Price = " + totalPrice);

         */

        ShoppingCart shoppingCart = new ShoppingCart();

        NonDigitalProduct keyboard = new NonDigitalProduct("Mechanical Gaming Keyboard", 48, 10, 450, new Dimension(1, 10, 2));

        NonDigitalProduct mouse = new NonDigitalProduct("Gaming Mouse", 48, 15, 100, new Dimension(1, 1, 1));

        NonDigitalProduct ecoDot = new NonDigitalProduct("Eco Dot (4th Generation)", 40, 12, 150, new Dimension(1, 1, 1));

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        DigitalProduct javaProgrammingBook = new DigitalProduct("JAVA Programming", 750, 15);

        DigitalProduct advancedJavaProgrammingBook = new DigitalProduct("Advanced JAVA Programming", 750, 15, "JAVA25");

        DigitalProduct javaThreadProgrammingBook = new DigitalProduct("JAVA Thread Programming", 350, 20);

        shoppingCart.addProduct(javaProgrammingBook);
        shoppingCart.addProduct(advancedJavaProgrammingBook);
        shoppingCart.addProduct(javaThreadProgrammingBook);

        System.out.println("ShoppingCart = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("totalPrice = " + totalPrice);

        Customer customer = new Customer("Mosharraf", new CreditCard(343434343434L, 234, "03/21"));

        Order order = customer.checkout(shoppingCart);

        System.out.println(order);
    }
}
