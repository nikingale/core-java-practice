package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public class Deer extends Animal {

    public Deer() {
        super();
    }

    public Deer(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating grass");
    }

    public void roam() {
        System.out.println("roaming");
    }

    public void makeNoise() {
        System.out.println("grunting");
    }

}