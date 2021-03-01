package com.github.nikingale.filehandling;

/**
 * @author Nikhil Ingale 05-04-2020
 */

public class TestJukeboxes {

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.play();

        System.out.println();
        AlphaJukebox alphaJukebox = new AlphaJukebox();
        alphaJukebox.play();
    }

}