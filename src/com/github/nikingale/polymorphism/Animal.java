package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class Animal {

    private String food;

    public Animal() {
    }

    public Animal(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void makeNoise() {
        System.out.println("making noise");
    }

}