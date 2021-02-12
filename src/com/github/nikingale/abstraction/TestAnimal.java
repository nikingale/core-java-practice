package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public class TestAnimal {

    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roam();
        lion.makeNoise();

        Animal deer = new Deer();
        deer.eat();
        deer.sleep();
        deer.roam();
        deer.makeNoise();

        Animal wolf = new Wolf();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
        wolf.makeNoise();

        PetDog doggy = new PetDog();
        doggy.eat();
        doggy.sleep();
        doggy.roam();
        doggy.makeNoise();
        doggy.beFriendly();
        doggy.play();
    }

}