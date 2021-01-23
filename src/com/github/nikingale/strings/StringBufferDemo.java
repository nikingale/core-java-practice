package com.github.nikingale.strings;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer string = new StringBuffer("StringBuffer");
        System.out.println(string);
        System.out.println(string.hashCode());

        string.append(" is mutable");
        System.out.println(string);
        System.out.println(string.hashCode());
    }

}