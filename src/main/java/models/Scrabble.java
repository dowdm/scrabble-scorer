package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Scrabble {
    List<Character> inputToArray = new ArrayList<Character>();
    Map<Character, Integer> scrabbleScoreBank = new HashMap<Character, Integer>();

    public Scrabble () {
      scrabbleScoreBank.put('a', 1);
      scrabbleScoreBank.put('e', 1);
      scrabbleScoreBank.put('i', 1);
      scrabbleScoreBank.put('o', 1);
      scrabbleScoreBank.put('u', 1);
      scrabbleScoreBank.put('l', 1);
      scrabbleScoreBank.put('n', 1);
      scrabbleScoreBank.put('r', 1);
      scrabbleScoreBank.put('s', 1);
      scrabbleScoreBank.put('t', 1);
      scrabbleScoreBank.put('d', 2);
      scrabbleScoreBank.put('g', 2);
      scrabbleScoreBank.put('b', 3);
      scrabbleScoreBank.put('c', 3);
      scrabbleScoreBank.put('m', 3);
      scrabbleScoreBank.put('p', 3);
      scrabbleScoreBank.put('f', 4);
      scrabbleScoreBank.put('h', 4);
      scrabbleScoreBank.put('v', 4);
      scrabbleScoreBank.put('w', 4);
      scrabbleScoreBank.put('y', 4);
      scrabbleScoreBank.put('k', 5);
      scrabbleScoreBank.put('j', 8);
      scrabbleScoreBank.put('x', 8);
      scrabbleScoreBank.put('q', 10);
      scrabbleScoreBank.put('z', 10);
  }







    public Integer calculateScore(String input){
      char[] splitArray = input.toLowerCase().toCharArray();
        for (char letter: splitArray) {
            Character wrappedLetter = letter;
            inputToArray.add(wrappedLetter);
        }
        Integer total = 0;
            for (Character singleLetter : inputToArray) {
              total +=  scrabbleScoreBank.get(singleLetter);
            }
        return total;
        }
    }



