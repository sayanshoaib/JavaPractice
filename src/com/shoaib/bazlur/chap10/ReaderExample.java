package com.shoaib.bazlur.chap10;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("/Users/shoaib/Desktop/projects/input.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
