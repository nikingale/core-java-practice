package com.github.nikingale.abstraction;

/**
 * @author Nikhil Ingale 02-04-2020
 */

public abstract class Animal {

    private String food;

    public Animal() {
    }

    public Animal(String food) {
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("sleeping");
    }

    public abstract void roam();

    public abstract void makeNoise();

}