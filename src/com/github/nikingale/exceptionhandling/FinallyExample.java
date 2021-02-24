package com.github.nikingale.exceptionhandling;

/**
 * @author Nikhil Ingale 04-04-2020
 */

public class FinallyExample {

    public void numberFormat() {
        System.out.println("Before the exception");

        String s = "abc";
        try {
            int i = Integer.parseInt(s);
        }
        finally {
            System.out.println("This is finally");
        }

        System.out.println("After the exception");
    }

}