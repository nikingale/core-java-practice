package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class Buffalo extends Animal {

    public Buffalo() {
    }

    public Buffalo(String food) {
        super(food);
    }

    public void makeNoise() {
        System.out.println("snorting");
    }

}