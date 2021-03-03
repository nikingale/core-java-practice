package com.github.nikingale.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Nikhil Ingale 07-04-2020
 */

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.add("One");
        pQueue.add("Two");
        pQueue.add("Three");

        Iterator<String> itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}