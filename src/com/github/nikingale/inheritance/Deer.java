package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
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

    public void makeNoise() {
        System.out.println("grunting");
    }

}