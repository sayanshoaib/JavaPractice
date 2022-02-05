package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRenamingExample {
    public static void main(String[] args) throws IOException {
        Path oldFilePath = Path.of("/Users/shoaib/Desktop/projects/hello.txt");
        Path targetPath = Path.of("/Users/shoaib/Desktop/projects/hello_renamed.txt");

        Path moved = Files.move(oldFilePath, targetPath);
        System.out.println(moved);
    }
}
