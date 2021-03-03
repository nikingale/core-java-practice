package com.github.nikingale.collections;

import java.util.LinkedList;

/**
 * @author Nikhil Ingale 07-04-2020
 */

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println(list);
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

    }

}