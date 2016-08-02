package com.k_linedev.game;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.Files.readAllLines;

/**
 * Created by caden on 7/30/16.
 */
public class logic {
    static ArrayList<String> usedWords = new ArrayList<String>();
    static ArrayList<String> realWords = new ArrayList<String>();
    static boolean dictionaryExists = false;
    public static void addWord(String word){
        usedWords.add(word);
    }
    public static boolean isReal(String word){
        boolean real = false;
        word = word.trim();
        if ( !(dictionaryExists))
            dictionary();
        for(String words: realWords){
            if(word.equalsIgnoreCase(words.trim()))
                real = true;
        }


        return real;
    }
    private static void dictionary(){
        try {
            realWords.addAll(Files.readAllLines(Paths.get("/home/caden/Development/IdeaProjects/eschool/build/resources/main/words.txt")));
           }catch (IOException e){
                System.out.println(e.toString());

        }
    }

}
