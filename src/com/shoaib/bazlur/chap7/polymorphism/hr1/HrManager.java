package com.shoaib.bazlur.chap7.polymorphism.hr1;

import com.shoaib.bazlur.chap7.polymorphism.hr0.Client;
import com.shoaib.bazlur.chap7.polymorphism.hr0.PayCalculator;

import java.util.ArrayList;

public class HrManager {

    private final ArrayList<Client> clients = new ArrayList<>();
    private PayCalculator payCalculator;

    public HrManager(PayCalculator payCalculator) {
        this.payCalculator = payCalculator;
    }

    public void addClient(Client client) {

        clients.add(client);
    }

    public double getTotalPay(String method) {
        double totalPay = 0.0;
        for (Client client : clients) {
            totalPay += payCalculator.getPay(client, method);
        }
        return totalPay;
    }
}
