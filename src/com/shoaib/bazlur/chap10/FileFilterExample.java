package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileFilterExample {
    public static void main(String[] args) throws IOException {
        Path pictureDir = Path.of("/Users/shoaib/Desktop/projects");

        Stream<Path> filteredPath = Files.list(pictureDir).filter(file -> file.toString().endsWith(".jpeg"));
        filteredPath.forEach(filePath -> {
            System.out.println(filePath);
        });
    }
}
