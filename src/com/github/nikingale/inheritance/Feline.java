package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Feline extends Animal {

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