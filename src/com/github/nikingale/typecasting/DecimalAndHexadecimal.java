package com.github.nikingale.typecasting;

public class DecimalAndHexadecimal {

    public static void main(String[] args) {
        System.out.println("Decimal to Hexadecimal-");
        Integer integer = 10;
        String hex = Integer.toHexString(integer);
        System.out.println("Decimal : " + integer);
        System.out.println("Hexadecimal : " + hex);

        System.out.println("\nHexadecimal to Decimal-");
        String hexNumber = "f";
        Integer integerNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("Hexadecimal : " + hexNumber);
        System.out.println("Decimal : " + integerNumber);
    }

}