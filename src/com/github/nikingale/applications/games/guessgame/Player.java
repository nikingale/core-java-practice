package com.github.nikingale.applications.games.guessgame;

public class Player {

    int guessedNumber;

    public int guess() {
        guessedNumber = (int) (Math.random() * 10);
        return guessedNumber;
    }

}