package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class JavaPathDemo {
    public static void main(String[] args) {
        Path path = Path.of("/Users/rokonoid/projects/java-programming/hello.txt");
        System.out.println(path);
    }
}
