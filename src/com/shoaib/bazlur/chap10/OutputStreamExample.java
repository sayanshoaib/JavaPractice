package com.shoaib.bazlur.chap10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamExample {
    public static void main(String[] args) {
        String destination = "/Users/shoaib/Desktop/projects/output.txt";
        String data = "I love java programming language.";

        OutputStream fos = null;
        try{
            fos = new FileOutputStream(destination);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            System.err.println("Unable to write text in " + destination);
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.err.println("Unable to close the outputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
