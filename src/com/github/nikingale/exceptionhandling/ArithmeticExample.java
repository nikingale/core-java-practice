package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class ArithmeticExample {

    public void divideByZero() {
        System.out.println("Before the exception");

        try {
            int result = 100 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("After the exception");
    }

}