package models;

import org.junit.*;
import static org.junit.Assert.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;

public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForAnotherSingleLetter_10() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("q"));
    }

    @Test
    public void calculateScore_returnsScoreForWord_5() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 5;
        assertEquals(expected, testScrabble.calculateScore("cat"));
    }

    @Test
    public void calculateScore_returnsScoreForMixedCaseWord_5() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 5;
        assertEquals(expected, testScrabble.calculateScore("Cat"));
    }
}