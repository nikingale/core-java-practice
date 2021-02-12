package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public abstract class Canine extends Animal {

    public Canine() {
        super();
    }

    public Canine(String food) {
        super(food);
    }

    public void roam() {
        System.out.println("roaming in pack");
    }

}