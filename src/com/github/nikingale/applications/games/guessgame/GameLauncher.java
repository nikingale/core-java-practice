package com.github.nikingale.applications.games.guessgame;

public class GameLauncher {

    public static void main(String[] args) {
        System.out.println("---The Guessing Game---\n");
        GuessGame game = new GuessGame();
        game.startGame();
    }

}