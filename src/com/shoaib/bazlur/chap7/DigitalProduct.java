package com.shoaib.bazlur.chap7;

public class DigitalProduct extends AbstractProduct {
//    public DigitalProduct(String name, int price, Dimension discount, int weight, Dimension dimension) {
//        super(name, price, discount, weight, dimension);
//    }

    private static final String JAVA_25 = "JAVA25";
    private static final String JAVA_2NDED = "JAVA2NDED";

    private String coupon;

    public DigitalProduct(String name, int price, int discount, String coupon) {
        super(name, price, discount);
        this.coupon = coupon;
    }

    public DigitalProduct(String name, int price, int discount) {
        super(name, price, discount);
    }

    @Override
    public int calculatePrice() {
        int couponDiscount = switch (coupon != null ? coupon : "") {
            case JAVA_25 -> 3;
            case JAVA_2NDED -> 5;
            default -> 0;
        };
        int totalDiscount = getDiscount() + couponDiscount;
        double price = getPrice() * ((100 - totalDiscount) / 100.0);

        return (int) price;
    }
}
