package com.shoaib.bazlur.chap7;

public class Random {
    static final int P1 = 32719;
    static final int P2 = 32749;

    int max;
    int last;

    public Random(int max) {
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    int nextInt() {
        last = (last * P1 + 3) % P2;
        return last % max;
    }
}
