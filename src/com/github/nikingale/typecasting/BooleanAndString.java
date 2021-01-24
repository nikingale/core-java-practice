package com.github.nikingale.typecasting;

/**
 * @author Nikhil Ingale 29-03-2020
 */

public class BooleanAndString {

    public static void main(String[] args) {
        System.out.println("Boolean to String-");
        boolean bool1 = true;
        String string1 = Boolean.toString(bool1);
        System.out.println("Boolean : " + bool1 + " --> " + "String : " + string1);

        System.out.println("\nString to Boolean-");
        String string2 = "true";
        String string3 = "tRUE";
        String string4 = "okay";
        boolean bool2 = Boolean.parseBoolean(string2);
        boolean bool3 = Boolean.parseBoolean(string3);
        boolean bool4 = Boolean.parseBoolean(string4);
        System.out.println("String: " + string2 + " --> " + "Boolean : " + bool2);
        System.out.println("String: " + string3 + " --> " + "Boolean : " + bool3);
        System.out.println("String: " + string4 + " --> " + "Boolean : " + bool4);
    }

}