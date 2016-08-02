package com.k_linedev.tests;
/**
 * Created by caden on 8/2/16.
 */
import static org.junit.Assert.*;

import com.k_linedev.game.logic;
import org.junit.Test;

public class logicTest {
    @Test
    public void isRealTest(){
        String realWord = "the";
        String fakeWord = "kjka";
        assertEquals(true, com.k_linedev.game.logic.isReal(realWord));
        assertEquals(false, com.k_linedev.game.logic.isReal(fakeWord));
    }
    @Test
    public void checkUsedTest(){
        String word = "the";
        logic.addWord(word);
        assertEquals(true, logic.checkUsed(word));
        assertEquals(false, logic.checkUsed("hi"));
    }
}
