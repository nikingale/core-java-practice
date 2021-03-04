package com.github.nikingale.applications.games.battleship;

public class BattleshipSetup {

    BattleshipGame run;

    public void launch() {
        run = new BattleshipGame();
        int i = (int) (Math.random() * 8);
        int[] locations = {i, (i + 1), (i + 2)};
        run.battleshipGame(locations);
    }

}