package com.shoaib.bazlur.chap8;

public class MultipleCatchDemo2 {
    public static void main(String[] args) {
        try {
            int numbers[] = new int[10];
            numbers[15] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ArithmeticException) {
                e.printStackTrace();
                System.out.println("You cannot divide by zero");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                e.printStackTrace();
                System.out.println("The index you tried to access " + "does not exist");
            }
        }
    }
}
