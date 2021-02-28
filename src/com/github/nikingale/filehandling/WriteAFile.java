package com.github.nikingale.filehandling;

import java.io.*;

/**
 * @author Nikhil Ingale 05-04-2020
 */

public class WriteAFile {

    public static void main(String[] args) {
        try {
            File file = new File("src/resources/file");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Java IO!");

            writer.close();
            System.out.println("File written successfully");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}