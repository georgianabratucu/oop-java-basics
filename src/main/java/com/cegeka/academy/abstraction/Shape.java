package com.cegeka.academy.abstraction;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public void getColor() {
        System.out.println("Shape color is " + color);
    }
}
