package com.github.nikingale.typecasting;

/**
 * @author Nikhil Ingale 29-03-2020
 */

public class DecimalAndOctal {

    public static void main(String[] args) {
        System.out.println("Decimal to Octal-");
        Integer integer = 10;
        String octal = Integer.toOctalString(integer);
        System.out.println("Decimal : " + integer);
        System.out.println("Octal : " + octal);

        System.out.println("\nOctal to Decimal-");
        String octalNumber = "50";
        Integer integerNumber = Integer.parseInt(octalNumber, 8);
        System.out.println("Octal : " + octalNumber);
        System.out.println("Decimal : " + integerNumber);
    }

}