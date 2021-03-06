package com.github.nikingale.applications.games.guessgame;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Number to guess : " + targetNumber);

        boolean isP1Right = false;
        boolean isP2Right = false;
        boolean isP3Right = false;

        while (true) {
            System.out.println("Player-1 has guessed " + p1.guess());
            System.out.println("Player-2 has guessed " + p2.guess());
            System.out.println("Player-3 has guessed " + p3.guess());

            if (p1.guessedNumber == targetNumber) {
                isP1Right = true;
            }
            if (p2.guessedNumber == targetNumber) {
                isP2Right = true;
            }
            if (p3.guessedNumber == targetNumber) {
                isP3Right = true;
            }

            if (isP1Right || isP2Right || isP3Right) {
                if (isP1Right) {
                    System.out.println("\nPlayer-1 is Winner!");
                }
                if (isP2Right) {
                    System.out.println("Player-2 is Winner!");
                }
                if (isP3Right) {
                    System.out.println("Player-3 is Winner!");
                }
                break;
            }
            else {
                System.out.println("\nNobody guessed right. Guess Again!");
            }
        }
        System.out.println("\nGame Over!");
    }

}