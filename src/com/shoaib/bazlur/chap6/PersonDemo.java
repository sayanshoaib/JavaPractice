package com.shoaib.bazlur.chap6;

public class PersonDemo {
    public static void main(String[] args) {
        Person shoaib = new Person("Shoaib", "Shoaib.Hasan1801@gmail.com", 22);
        shoaib.printInfo();
        Person nur = new Person("Nur", "Nur28@gmail.com", 10);
        nur.printInfo();
        Person ronaldo = new Person("Ronaldo", "Ronaldo@gmail.com", 36);
        ronaldo.printInfo();
    }
}
