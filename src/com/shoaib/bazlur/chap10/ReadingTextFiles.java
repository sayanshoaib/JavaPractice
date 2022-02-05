package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingTextFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/shoaib/Desktop/projects/hello.java");
        String text = Files.readString(path);
        System.out.println(text);

        Path photoPath = Path.of("/Users/shoaib/Desktop/projects/cheetah.jpeg");
        byte[] allBytes = Files.readAllBytes(photoPath);
        System.out.println(allBytes);
    }
}
