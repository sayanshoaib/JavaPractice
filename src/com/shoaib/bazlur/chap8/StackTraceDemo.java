package com.shoaib.bazlur.chap8;

public class StackTraceDemo {
    public static void main(String[] args) {
        StackTraceDemo stackTraceDemo = new StackTraceDemo();
        stackTraceDemo.methodA();
    }

    public void methodA() {
        methodB();
    }

    public void methodB() {
        methodC();
    }

    public void methodC() {
        methodD();
    }

    public void methodD() {
        methodE();
    }

    public void methodE() {
        methodF();
    }

    public void methodF() {
        throw new RuntimeException("Exception");
    }
}
