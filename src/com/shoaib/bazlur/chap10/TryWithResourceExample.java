package com.shoaib.bazlur.chap10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("/Users/shoaib/Desktop/projects/input.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                System.err.println((char) c);
            }
        } catch (IOException e) {
            System.err.println("Could not read file");
            e.printStackTrace();
        }
    }
}
