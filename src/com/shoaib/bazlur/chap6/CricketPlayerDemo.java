package com.shoaib.bazlur.chap6;

public class CricketPlayerDemo {
    public static void main(String[] args) {
        CricketPlayer sayem = new CricketPlayer("Sayem");
        sayem.addScore(1);
        sayem.addScore(4);
        sayem.addScore(6);
        sayem.addScore(4);

        CricketPlayer nur = new CricketPlayer("Nur");
        nur.addScore(6);
        nur.addScore(4);
        nur.addScore(6);
        nur.addScore(4);

        CricketPlayer sourav = new CricketPlayer("Sourav");
        sourav.addScore(2);
        sourav.addScore(4);
        sourav.addScore(4);
        sourav.addScore(6);

        CricketPlayer shoaib = new CricketPlayer("Shoaib");
        shoaib.addScore(1);
        shoaib.addScore(2);
        shoaib.addScore(4);
        shoaib.addScore(6);

        System.out.println("Sayem scored = " + sayem.getScore());
        System.out.println("Nur scored = " + nur.getScore());
        System.out.println("Sourav scored = " + sourav.getScore());
        System.out.println("Shoaib scored = " + shoaib.getScore());


        System.out.println("Total score: " + CricketPlayer.getTotalScore());

    }
}
