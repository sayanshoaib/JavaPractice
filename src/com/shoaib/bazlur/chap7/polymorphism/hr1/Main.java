package com.shoaib.bazlur.chap7.polymorphism.hr1;

import com.shoaib.bazlur.chap7.polymorphism.hr0.Client;
import com.shoaib.bazlur.chap7.polymorphism.hr0.HrManager;

public class Main {
    public static void main(String[] args) {
        PayCalculator calculator = new FixedPayCalculator(75);
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
