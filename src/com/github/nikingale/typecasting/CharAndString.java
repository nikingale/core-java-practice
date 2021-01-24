package com.github.nikingale.typecasting;

/**
 * @author Nikhil Ingale 29-03-2020
 */

public class CharAndString {

    public static void main(String[] args) {
        char character = 'C';
        String charString = Character.toString(character);

        System.out.println("Character to String-");
        System.out.println("Character : " + character);
        System.out.println("String : " + charString);


        System.out.println("\nString to Character-");
        String string = "Discovery";
        System.out.println("String : " + string);

        System.out.println("\nSingle character using charAt() method-");
        char c = string.charAt(0);
        System.out.println("Character at index 0 : " + c);

        System.out.println("\nAll characters using charAt() method in for loop-");
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            System.out.println("Character at index " + i + " : " + ch);
        }

        System.out.println("\nCopying string to character array and printing array-");
        char[] chArray = string.toCharArray();
        System.out.println(chArray);
    }

}