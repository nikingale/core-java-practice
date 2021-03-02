package com.github.nikingale.multithreading;

/**
 * @author Nikhil Ingale 06-04-2020
 */

public class TestSingASong {

    public static void main(String[] args) {
        Runnable threadJob = new SingASong();
        Thread myThread = new Thread(threadJob);

        myThread.start();
        System.out.println("Come on!");
    }

}