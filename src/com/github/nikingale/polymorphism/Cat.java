package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String food) {
        super(food);
    }

    public void makeNoise() {
        System.out.println("meowing");
    }

}