package com.shoaib.bazlur.chap8;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int numbers[] = new int[10];
            numbers[15] = 30 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("You cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("The index you tried to access " + "does not exist");
        }
    }
}
