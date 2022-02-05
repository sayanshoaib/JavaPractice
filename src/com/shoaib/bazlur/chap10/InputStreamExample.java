package com.shoaib.bazlur.chap10;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        InputStream in = null;

        try{
            in = new FileInputStream("/Users/shoaib/Desktop/projects/input.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c + ", ");
            }
        } catch (IIOException e) {
            System.err.println("Could not read file");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Unable to close FileInputsStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
