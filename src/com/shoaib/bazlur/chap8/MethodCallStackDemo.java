package com.shoaib.bazlur.chap8;

public class MethodCallStackDemo {
    public static void main(String[] args) {                       // Stack
        System.out.println("Inside main method");                  // |  D |
        methodA();                                                 // |  C |
        System.out.println("Exiting main method");                 // |  B |
    }                                                              // |  A |
                                                                   // |main|
    public static void methodA() {                                 // ------
        System.out.println("Inside method A");
        methodB();
        System.out.println("Exiting method A");
    }

    public static void methodB() {
        System.out.println("Inside method B");
        methodC();
        System.out.println("Exiting method B");
    }

    public static void methodC() {
        System.out.println("Inside method C");
        methodD();
        System.out.println("Exiting method C");
    }

    public static void methodD() {
        System.out.println("Inside method D");
        //System.out.println(5 / 0);
        System.out.println("Exiting method D");
    }
}
