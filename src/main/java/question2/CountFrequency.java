// source: https://www.javatpoint.com/how-to-read-csv-file-in-java

package main.java.question2;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

import static java.io.File.*;

public class CountFrequency {
    public CountFrequency(String country) {

    }

    public static void readCSVFile() throws IOException {
        //parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("src/main/java/question2/countries.csv"));
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.println(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close(); //closes the scanner
        System.out.println("CountFrequency successfully read countries.csv file!");
    }

    public void countFrequency() {
        Map<String,Integer> mp=new TreeMap<>();
        String[] country = new String(slashify(Path.of("src/main.java/question2/countries.csv")));
        for(int i=0;i<country.length;i++)
        {
            // Condition to check if the array element is present the hash-map
            if(mp.containsKey(country[i]))
            {
                mp.put(country[i], mp.get(country[i])+1);
            }
            else
            {
                mp.put(country[i],1);
            }
        }

        // Loop to iterate over the elements of the map
        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }
}
