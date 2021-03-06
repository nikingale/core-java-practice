package com.github.nikingale.applications.games.battleship;

/**
 * @author Nikhil Ingale 08-04-2020
 */

public class BattleshipLauncher {

    public static void main(String[] args) {
        System.out.println("---THE BATTLESHIP GAME---");
        System.out.println("The enemy ship is in front, out in the ocean. It is 3 consecutive cells long in a 10 cells Ocean."
                + "\nAim and fire shots to kill and sink the ship in minimum shots."
                + "\nGlory to you!\n");
        BattleshipSetup game = new BattleshipSetup();
        game.launch();
    }

}