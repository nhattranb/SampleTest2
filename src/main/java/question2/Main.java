package main.java.question2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CountFrequency myCount = new CountFrequency("countries.csv");
        try {
            myCount.readCSVFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        myCount.countFrequency();
    }
}
