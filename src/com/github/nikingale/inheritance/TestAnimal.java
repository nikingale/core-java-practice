package com.github.nikingale.inheritance;

public class TestAnimal {

    public static void main(String[] args) {
        Animal lion = new Lion();

        lion.eat();
        lion.sleep();
        lion.roam();
        lion.makeNoise();
    }

}