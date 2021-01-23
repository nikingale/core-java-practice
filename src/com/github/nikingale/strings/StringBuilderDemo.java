package com.github.nikingale.strings;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("BAT");
        System.out.println("String - " + string);
        System.out.println(string.hashCode());

        string = string.reverse();
        System.out.println("Reverse - " + string);
        System.out.println(string.hashCode());

        string = string.replace(0, 1, "L");
        System.out.println("Replaced Letters - " + string);
        System.out.println(string.hashCode());
    }

}