package com.github.nikingale.collections;

import java.util.HashSet;

/**
 * @author Nikhil Ingale 07-04-2020
 */

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println(set);

    }

}