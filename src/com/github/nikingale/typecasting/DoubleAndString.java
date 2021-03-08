package com.github.nikingale.typecasting;

/**
 * @author Nikhil Ingale 29-03-2020
 */

public class DoubleAndString {

    public static void main(String[] args) {
        double doubleNumber = 10.5d;

        System.out.println("Double to String-");
        String stringNumber = Double.toString(doubleNumber);
        System.out.println("Double : " + doubleNumber);
        System.out.println("String : " + stringNumber);

        System.out.println("\nString to Double-");
        doubleNumber = Double.parseDouble(stringNumber);
        System.out.println("String : " + stringNumber);
        System.out.println("Double : " + doubleNumber);
    }

}