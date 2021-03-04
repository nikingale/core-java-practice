package com.github.nikingale.applications.games.battleship;

public class BattleshipLauncher {

    public static void main(String[] args) {
        System.out.println("---THE BATTLESHIP GAME---");
        System.out.println("The enemy ship is in front, out in the ocean. It is 3 consecutive cells long in a 10 cells Ocean."
                + "\nAim and fire shots to kill and sink the ship in minimun shots."
                + "\nGlory to you!\n");
        BattleshipSetup game = new BattleshipSetup();
        game.launch();
    }

}