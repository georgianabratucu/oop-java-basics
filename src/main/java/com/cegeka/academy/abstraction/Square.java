package com.cegeka.academy.abstraction;

public class Square extends Shape implements Drawable {

    private double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }

    public void draw() {

        System.out.println("Drawing a square");

        for(int i = 0; i < Math.round(length); i++) {
            for(int j = 0; j < Math.round(length); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
