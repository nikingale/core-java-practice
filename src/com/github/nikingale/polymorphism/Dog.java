package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String food) {
        super(food);
    }

    public void makeNoise() {
        System.out.println("barking");
    }

}