package com.github.nikingale.applications.games.guessgame;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class Player {

    int guessedNumber;

    public int guess() {
        guessedNumber = (int) (Math.random() * 10);
        return guessedNumber;
    }

}