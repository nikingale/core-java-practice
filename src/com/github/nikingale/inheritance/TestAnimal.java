package com.github.nikingale.inheritance;

public class TestAnimal {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roam();
        lion.makeNoise();

        Deer deer = new Deer("grass");
        deer.eat();
        deer.sleep();
        deer.roam();
        deer.makeNoise();

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.sleep();
        wolf.roam();
        wolf.makeNoise();
    }

}