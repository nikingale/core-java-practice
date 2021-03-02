package com.github.nikingale.multithreading;

/**
 * @author Nikhil Ingale 06-04-2020
 */

public class SingASong implements Runnable {

    public void run() {
        go();
    }

    public void go() {
        singTheSong();
    }

    public void singTheSong() {
        System.out.println("We Will We Will Rock You!");
    }

}