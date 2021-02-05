package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Canine extends Animal {

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