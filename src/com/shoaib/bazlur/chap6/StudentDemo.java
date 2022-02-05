package com.shoaib.bazlur.chap6;

public class StudentDemo {
    public static void main(String[] args) {
        Student nur = new Student("Nur", new double[]{
            97.5, 95.75, 100
        });

        double totalMarks = nur.totalMarks();
        double average = nur.average();

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average = " + average);
    }
}
