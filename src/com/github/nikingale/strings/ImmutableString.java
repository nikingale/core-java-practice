package com.github.nikingale.strings;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class ImmutableString {

    public static void main(String[] args) {
        String string = "Strings";
        System.out.println(string);
        System.out.println(string.hashCode());

        string = string + " are immutable";
        System.out.println(string);
        System.out.println(string.hashCode());
    }

}