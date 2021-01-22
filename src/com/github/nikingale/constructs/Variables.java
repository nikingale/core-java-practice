package com.github.nikingale.constructs;

/**
 * @author Nikhil Ingale 26-03-2020
 */

public class Variables {

    public static void main(String[] args) {

        byte byteLower = Byte.MIN_VALUE;
        byte byteUpper = Byte.MAX_VALUE;

        short shortLower = Short.MIN_VALUE;
        short shortUpper = Short.MAX_VALUE;

        int intLower = Integer.MIN_VALUE;
        int intUpper = Integer.MAX_VALUE;

        float floatLower = Float.MIN_VALUE;
        float floatUpper = Float.MAX_VALUE;

        long longLower = Long.MIN_VALUE;
        long longUpper = Long.MAX_VALUE;

        double doubleLower = Double.MIN_VALUE;
        double doubleUpper = Double.MAX_VALUE;

        char charLower = Character.MIN_VALUE;
        char charUpper = Character.MAX_VALUE;

        boolean booleanDefault = false;

        System.out.println("Byte : Lowerbound = " + byteLower + " and Upperbound = " + byteUpper);
        System.out.println("Short : Lowerbound = " + shortLower + " and Upperbound = " + shortUpper);
        System.out.println("Int : Lowerbound = " + intLower + " and Upperbound = " + intUpper);
        System.out.println("Float : Lowerbound = " + floatLower + " and Upperbound = " + floatUpper);
        System.out.println("Long : Lowerbound = " + longLower + " and Upperbound = " + longUpper);
        System.out.println("Double : Lowerbound = " + doubleLower + " and Upperbound = " + doubleUpper);
        System.out.println("Char : Lowerbound = 0->" + charLower + " and Upperbound = 65535->" + charUpper);
        System.out.println("Boolean : Default = " + booleanDefault + " and Other = true");

    }

}