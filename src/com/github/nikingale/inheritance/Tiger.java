package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Tiger extends Feline {

    public Tiger() {
        super();
    }

    public Tiger(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating flesh");
    }

    public void makeNoise() {
        System.out.println("roaring");
    }

}