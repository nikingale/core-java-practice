package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class NullPointerExample {

    public void nullPointer() {
        System.out.println("Before the exception");

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println("After the exception");
    }

}