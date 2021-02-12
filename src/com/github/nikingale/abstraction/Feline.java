package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public abstract class Feline extends Animal {

    public Feline() {
        super();
    }

    public Feline(String food) {
        super(food);
    }

    public void roam() {
        System.out.println("roaming lonely");
    }

}