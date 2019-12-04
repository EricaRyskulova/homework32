package com.company;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Song song = new Song("Power ballad", "James Hetfield", "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n" +
                "…\n", "rock");
        System.out.println(song);

        FileWriter fileWriter = new FileWriter("nothing else matters.txt");
//        FileReader fileReader = new FileReader("file.txt");
        fileWriter.write("Name: Power ballad, Performer: James Hetfield, text:  \"So close, no matter how far\\n\" +\n" +
                "                \"Couldn't be much more from the heart\" +\n" +
                "                \"Forever trusting who we are\" +\n" +
                "                \"And nothing else matters\" +\n" +
                "                \"Never opened myself this way\" +\n" +
                "                \"Life is ours, we live it our way\" +\n" +
                "                \"All these words I don't just say\" +\n" +
                "                \"And nothing else matters\" +\n" +
                "                 + \" genre: rock");
//fileReader.close();
        fileWriter.close();

    }
}

