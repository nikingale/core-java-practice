package com.github.nikingale.typecasting;

public class DecimalAndBinary {

    public static void main(String[] args) {
        System.out.println("Decimal to Binary-");
        Integer integer = 10;
        String binary = Integer.toBinaryString(integer);
        System.out.println("Decimal : " + integer);
        System.out.println("Binary : " + binary);

        System.out.println("\nBinary to Decimal-");
        String binaryNumber = "10101";
        Integer integerNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Binary : " + binaryNumber);
        System.out.println("Decimal : " + integerNumber);
    }

}