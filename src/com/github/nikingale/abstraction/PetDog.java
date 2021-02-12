package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public class PetDog extends Canine implements Pet {

    public PetDog() {
    }

    public PetDog(String food) {
        super(food);
    }

    public void eat() {
        System.out.println("eating cookies");
    }

    public void roam() {
        System.out.println("roaming in house");
    }

    public void makeNoise() {
        System.out.println("barking");
    }

    @Override
    public void beFriendly() {
        System.out.println("friendly with owner");
    }

    @Override
    public void play() {
        System.out.println("playing with owner");
    }

}