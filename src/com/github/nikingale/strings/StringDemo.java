package com.github.nikingale.strings;

import java.lang.String;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class StringDemo {

    public static void main(String[] args) {

        //using string literal
        String name1 = "Robert";

        //using keyword new
        String name2 = new String("David");

        //by converting character array
        char[] nameArray = {'J', 'o', 'h', 'n'};
        String name3 = new String(nameArray);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

}