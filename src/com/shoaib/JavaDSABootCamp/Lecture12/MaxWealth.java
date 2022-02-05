package com.shoaib.JavaDSABootCamp.Lecture12;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println("Max Wealth: " + maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
