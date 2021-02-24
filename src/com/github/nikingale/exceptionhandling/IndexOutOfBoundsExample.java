package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class IndexOutOfBoundsExample {

    public void indexOutOfBounds() {
        System.out.println("Before the exception");

        int[] array = new int[5];
        try {
            array[10] = 100;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("After the exception");
    }

}