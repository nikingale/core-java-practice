package com.github.nikingale.inheritance;

public class TestAnimal {

    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roam();
        lion.makeNoise();

        Animal deer = new Deer("grass");
        deer.sleep();
        deer.roam();
        deer.makeNoise();

        Animal wolf = new Wolf();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
        wolf.makeNoise();
    }

}