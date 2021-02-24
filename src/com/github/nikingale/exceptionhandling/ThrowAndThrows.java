package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class ThrowAndThrows {

    public void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age not valid!");
        }
        else {
            System.out.println("Welcome to vote!");
        }
    }

}