package com.github.nikingale.strings;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class StringConcatenation {

    public static void main(String[] args) {

        String firstname = "John";
        String surname = " Wick";
        String fullname1 = firstname + surname;
        String fullname2 = firstname.concat(surname);

        System.out.println("First name - " + firstname);
        System.out.println("Surname -" + surname);
        System.out.println("\nFull name - ");
        System.out.println("By + operator - " + fullname1);
        System.out.println("By concat() method - " + fullname2);
    }

}