package com.github.nikingale.applications.games.battleship;

import java.util.Scanner;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class BattleshipGame {

    int[] locationCells;

    public void battleshipGame(int[] locations) {
        locationCells = locations;
        boolean isAlive = true;
        int guess;
        int numOfGuesses = 0;
        int numberOfHits = 0;
        String result = null;
        Scanner scan = new Scanner(System.in);

        while (isAlive) {
            System.out.print("Aim a shot : ");
            guess = scan.nextInt();
            numOfGuesses++;
            result = "Miss";

            for (int cell = 0; cell < locationCells.length; cell++) {
                if (locationCells[cell] != -1 && locationCells[cell] == guess) {
                    numberOfHits++;

                    if (numberOfHits == 3) {
                        result = "Kill";
                        isAlive = false;
                        break;
                    }

                    result = "Hit";
                    locationCells[cell] = -1;
                    break;
                }
            }
            System.out.println(result);
        }
        System.out.println("\nYou sank the ship in " + numOfGuesses + " shots!");
    }

}