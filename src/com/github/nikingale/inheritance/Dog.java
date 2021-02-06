package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Dog extends Canine {

    public Dog() {
        super();
    }

    public Dog(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating flesh and cookies");
    }

    public void makeNoise() {
        System.out.println("barking");
    }

}