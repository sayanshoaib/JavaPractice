package com.shoaib;

public class exerciseChapter2p3c {
    public static void main(String[] args)
    {
        int i, j, k, rows=5;
        for (i=rows; i>= 1 ; i--)
        {
            for (j = i; j<rows ; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2*i -1) ;k++)
            {
                if( k==1 || i == rows || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
