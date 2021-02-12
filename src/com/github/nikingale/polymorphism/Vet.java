package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class Vet {

    public void giveShot(Animal animal) {
        System.out.println("making shot ready");
        System.out.println("giving shot");
        animal.makeNoise();
    }

}