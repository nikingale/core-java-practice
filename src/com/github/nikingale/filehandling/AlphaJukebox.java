package com.github.nikingale.filehandling;

import java.util.*;
import java.io.*;

/**
 * @author Nikhil Ingale 05-04-2020
 */

public class AlphaJukebox {

    List<String> songList = new ArrayList<>();

    public void play() {
        getSongs();
        Collections.sort(songList);
        for (String song : songList) {
            System.out.println(song);
        }
    }

    public void getSongs() {
        try {
            File file = new File("src/resources/SongList");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addSong(String line) {
        String[] tokens = line.split("/");
        songList.add(tokens[0]);
    }

}