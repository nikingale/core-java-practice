package com.github.nikingale.inheritance;

/**
 * @author Nikhil Ingale 31-03-2020
 */

public class Animal {

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

    public void eat() {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }

    public void roam() {
        System.out.println("roaming");
    }

    public void makeNoise() {
        System.out.println("making noise");
    }

}