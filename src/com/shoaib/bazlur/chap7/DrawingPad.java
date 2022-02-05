package com.shoaib.bazlur.chap7;

public class DrawingPad {
    public void draw(Shape shape) {
        String actualType = shape.getClass().getTypeName();

        System.out.println("Actual type: " + actualType);
        System.out.println("Drawing " + shape.getName());
    }
}
