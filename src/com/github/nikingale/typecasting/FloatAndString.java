package com.github.nikingale.typecasting;

public class FloatAndString {

    public static void main(String[] args) {
        float floatNumber = 10.5f;

        System.out.println("Float to String-");
        String stringNumber = Float.toString(floatNumber);
        System.out.println("Float : " + floatNumber);
        System.out.println("String : " + stringNumber);

        System.out.println("\nString to Float-");
        floatNumber = Float.parseFloat(stringNumber);
        System.out.println("String : " + stringNumber);
        System.out.println("Float : " + floatNumber);
    }

}