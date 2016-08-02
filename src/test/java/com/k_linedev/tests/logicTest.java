package com.k_linedev.tests; /**
 * Created by caden on 8/2/16.
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class logicTest {
    @Test
    public void isRealTest(){
        String realWord = "the";
        String fakeWord = "kjka";
        assertEquals(true, com.k_linedev.game.logic.isReal(realWord));
        assertEquals(true, com.k_linedev.game.logic.isReal(fakeWord));
    }
}
