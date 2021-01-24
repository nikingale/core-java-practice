package com.github.nikingale.typecasting;

public class IntAndLong {

    public static void main(String[] args) {
        System.out.println("Integer to Long-");
        int integerNumber = 10;
        long longNumber = integerNumber;
        System.out.println("Integer : " + integerNumber);
        System.out.println("Long : " + longNumber);

        System.out.println("\nLong to Integer-");
        long LongNumber = 5000L;
        int IntegerNumber = (int) LongNumber;
        System.out.println("Long : " + LongNumber);
        System.out.println("Integer : " + IntegerNumber);
    }

}