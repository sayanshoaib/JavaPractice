package com.shoaib.JavaDSABootCamp.Lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class RubiksCubeGrid3X3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][][] cube = {
                {
                        {"Green1, Green2 Green3"}, {"Red1, Red2, Red3"}, {"Yellow1, Yellow2, Yellow3"}
                },
                {
                        {"Green4, Green5 Green6"}, {"Red4, Red5, Red6"}, {"Yellow4, Yellow5, Yellow6"}
                },
                {
                        {"Green7, Green8, Green9"}, {"Red7, Red8, Red9"}, {"Yellow7, Yellow8, Yellow9"}
                }
        };



        for (int row = 0; row < cube.length; row++) {
            for (int col = 0; col < cube[row].length; col++) {
                for (int layer = 0; layer < cube[col].length; layer++) {
                    System.out.print(cube[row][col][layer]);
                }
            }
        }



        //System.out.println(Arrays.toString(cube));
    }
}
