package com.shoaib.bazlur.chap10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        String text = """
            আমি বাংলায় গান গাই
            আমি বাংলার গান গাই
            আমি আমার আমিকে চিরদিন
            এই বাংলায় খুঁজে পাই
            """;
        try (Writer writer = new FileWriter("/Users/shoaib/Desktop/projects/output.txt")) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
