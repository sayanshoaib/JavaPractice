package com.shoaib.bazlur.chap7;

public class DrawingPadDemo {
    public static void main(String[] args) {
        DrawingPad pad = new DrawingPad();
        Circle circle = new Circle();
        Square square = new Square();

        pad.draw(circle);
        pad.draw(square);
    }
}
