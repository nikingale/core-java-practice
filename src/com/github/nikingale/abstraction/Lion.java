package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public class Lion extends Feline {

    public Lion() {
        super();
    }

    public Lion(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating flesh");
    }

    public void makeNoise() {
        System.out.println("roaring");
    }

}