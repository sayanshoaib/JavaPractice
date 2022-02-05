package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        Path myWorkingDir = Path.of("/Users/shoaib/Desktop/projects");
        Stream<Path> list = Files.list(myWorkingDir);
        list.forEach(file -> {
            System.out.println(file);
        });
    }
}
