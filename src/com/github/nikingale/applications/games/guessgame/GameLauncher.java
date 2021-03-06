package com.github.nikingale.applications.games.guessgame;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class GameLauncher {

    public static void main(String[] args) {
        System.out.println("---The Guessing Game---\n");
        GuessGame game = new GuessGame();
        game.startGame();
    }

}