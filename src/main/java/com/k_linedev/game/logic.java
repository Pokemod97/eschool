package com.k_linedev.game;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;


/**
 * Created by caden on 7/30/16.
 */
public class logic {
    private static ArrayList<String> usedWords = new ArrayList<String>();
    private static ArrayList<String> realWords = new ArrayList<String>();
    private static boolean dictionaryExists = false;
    /**
     * @param word
     * Adds word to list of used words
     */
    public static void addWord(String word){
        usedWords.add(word);
    }

    /**
     *
     * @param word
     * @return whether the word is real
     *
     */
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
            realWords.addAll(Files.readAllLines(Paths.get("words.txt")));
           }catch (IOException e){
                System.out.println(e.toString());

        }
    }
    /**
     *
     * @param word
     * @return true if the word has been used
     */
    public static boolean checkUsed(String word){
        boolean used = false;
        for (String usedWord: usedWords ){
            if(word.trim().equalsIgnoreCase(usedWord))
                used = true;
        }
        return used;
    }


}
