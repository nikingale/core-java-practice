package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Cat extends Feline {

    public Cat() {
        super();
    }

    public Cat(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating mouse");
    }

    public void makeNoise() {
        System.out.println("meowing");
    }

}