package com.github.nikingale.typecasting;

public class IntegerAndString {

    public static void main(String[] args) {
        int integerNumber = 10;

        //using valueOf() method of String class
        String string = String.valueOf(integerNumber);

        System.out.println("Integer to String-");
        String stringNumber = Integer.toString(integerNumber);
        System.out.println("Integer : " + integerNumber);
        System.out.println("String : " + stringNumber);

        System.out.println("\nString to Integer-");
        stringNumber = "500";
        integerNumber = Integer.parseInt(stringNumber);
        System.out.println("String : " + stringNumber);
        System.out.println("Integer : " + integerNumber);
    }

}