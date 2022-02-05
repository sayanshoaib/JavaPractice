package com.shoaib.bazlur.chap10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        Path copyFrom = Path.of("/Users/shoaib/Desktop/projects/hello_renamed.txt");
        Path copyTo = Path.of("/Users/shoaib/Desktop/projects/copied.txt");
        Files.copy(copyFrom, copyTo, StandardCopyOption.REPLACE_EXISTING);
    }
}
