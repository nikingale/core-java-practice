package com.github.nikingale.filehandling;

import java.io.*;

/**
 * @author Nikhil Ingale 05-04-2020
 */

public class ReadAFile {

    public static void main(String[] args) {
        try {
            File file = new File("src/resources/file");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            System.out.println("\nFile read successfully");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}