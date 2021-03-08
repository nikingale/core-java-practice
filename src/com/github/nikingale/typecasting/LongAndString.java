package com.github.nikingale.typecasting;

/**
 * @author Nikhil Ingale 29-03-2020
 */

public class LongAndString {

    public static void main(String[] args) {
        long longNumber = 123456789L;

        System.out.println("Long to String-");
        String stringNumber = Long.toString(longNumber);
        System.out.println("Long : " + longNumber);
        System.out.println("String : " + stringNumber);

        System.out.println("\nString to Long-");
        stringNumber = "12345";
        longNumber = Long.parseLong(stringNumber);
        System.out.println("String : " + stringNumber);
        System.out.println("Long : " + longNumber);
    }

}