package com.cegeka.academy.polymorphism;

public class PolymorphismTest {

    public static void main(String[] args) {

        //Dynamic Polymorphism - method overriding
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.eat();
        cat.eat();

        //Static Polymorphism - method overloading
        Calculator calculator = new Calculator();

        calculator.add(10, 20);
        calculator.add(10, 20, 30);
    }
}
