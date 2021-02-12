package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public class Wolf extends Canine {

    public Wolf() {
        super();
    }

    public Wolf(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating flesh");
    }

    public void makeNoise() {
        System.out.println("howling");
    }

}