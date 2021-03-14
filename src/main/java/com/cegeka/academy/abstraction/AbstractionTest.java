package com.cegeka.academy.abstraction;

public class AbstractionTest {

    public static void main(String[] args) {
        Shape shape = new Square("Red", 8.1);
        System.out.println(shape.area());
        shape.getColor();
        Drawable square = new Square("Green", 4.7);
        square.draw();
    }
}
