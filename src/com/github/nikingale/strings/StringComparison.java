package com.github.nikingale.strings;

/**
 * @author Nikhil Ingale 28-03-2020
 */

public class StringComparison {

    public static void main(String[] args) {

        String s1 = "Mumbai";
        String s2 = "Mumbai";
        String s3 = new String("Mumbai");
        String s4 = "Paris";
        String s5 = "Chicago";

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);
        System.out.println("s5 : " + s5);


        System.out.println("\nContent comparison-");
        System.out.println("Compare(s1, s2) " + s1.equals(s2));
        System.out.println("Compare(s1, s3) " + s1.equals(s3));
        System.out.println("Compare(s1, s4) " + s1.equals(s4));

        System.out.println("\nReference comparison-");
        System.out.println("Compare(s1, s2) " + (s1 == s2));
        System.out.println("Compare(s1, s3) " + (s1 == s3));
        System.out.println("Compare(s1, s4) " + (s1 == s4));

        System.out.println("\nSequence comparison-");
        System.out.println("Compare(s1, s2) " + s1.compareTo(s2));
        System.out.println("Compare(s1, s3) " + s1.compareTo(s3));
        System.out.println("Compare(s1, s4) " + s1.compareTo(s4));
        System.out.println("Compare(s1, s5) " + s1.compareTo(s5));

    }

}