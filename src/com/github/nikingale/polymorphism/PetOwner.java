package com.github.nikingale.polymorphism;

/**
 * @author Nikhil Ingale 01-04-2020
 */

public class PetOwner {

    public static void main(String[] args) {
        Vet vet = new Vet();

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal buffalo = new Buffalo();

        vet.giveShot(buffalo);
    }

}