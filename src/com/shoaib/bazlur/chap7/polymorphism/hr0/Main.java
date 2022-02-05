package com.shoaib.bazlur.chap7.polymorphism.hr0;

public class Main {
    public static void main(String[] args) {
        HrManager hrManager = new HrManager();

        Client client0 = new Client("Mosharraf", 45);
        hrManager.addClient(client0);

        Client client1 = new Client("Nowshad", 41);
        hrManager.addClient(client1);

        double getTotalFixedPay = hrManager.getTotalPay("FIXED");
        System.out.println("totalPay = " + getTotalFixedPay + " USD");

        double hourlyTotalPay = hrManager.getTotalPay("HOURLY");
        System.out.println("hourlyTotalPay = " + hourlyTotalPay + " USD");
    }
}
