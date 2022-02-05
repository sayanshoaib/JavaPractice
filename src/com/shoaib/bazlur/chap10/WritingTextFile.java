package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingTextFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/shoaib/Desktop/projects/hello.java");
        String code = """
                //This is a program to calculate some of two numbers
                //Input two integer number 
                """;
        Files.writeString(path, code);
    }
}
