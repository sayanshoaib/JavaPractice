package com.shoaib.bazlur.chap9;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Shoaib", "Hasan");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Nur", 11);
        person.showTypes();
    }
}
