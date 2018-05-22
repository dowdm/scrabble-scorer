import models.Scrabble;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while(programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Scrabble Word Score Calculator");
            System.out.println("Enter a single word and I'll calculate its Scrabble point score:");
            try {
                String userEntry = bufferedReader.readLine();
                Scrabble scrabble = new Scrabble();
                Integer wordScore = scrabble.calculateScore(userEntry);
                System.out.println(wordScore);
                System.out.println("Would you like to exit - yes or no?");
                String exitResponse = bufferedReader.readLine();
                if(exitResponse.equals("yes")){
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
