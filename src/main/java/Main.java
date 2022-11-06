/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Objects;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        int previousGuess = 0;
        int numberOfTries = 0;
        int mostRecentGuess = 0;
        int mysteryNumber = GameEngine.getMysteryNumber();
        System.out.println("Hi Mahiri,Welcome to the Guessing Game Too Large Too Small");
       // System.out.println(mysteryNumber);
        while (mostRecentGuess != 100) {
             mostRecentGuess = GameEngine.getIntegerInput("Please take a guess from 0 - 10 here: " + "\n Enter 100 to exit");
             if (mostRecentGuess < 11) {
                 if (mostRecentGuess == previousGuess) {
                        System.out.println("Didn't work last time, did it? Try Again!");
                 } else if (mostRecentGuess == mysteryNumber) {
                        numberOfTries++;
                        System.out.println("You Win! Correct guess :)");
                 } else if (mostRecentGuess < mysteryNumber) {
                        numberOfTries++;
                        System.out.println("Too Small, Try Again!");
                 } else if (mostRecentGuess > mysteryNumber) {
                        numberOfTries++;
                        System.out.println("Too Large, Try Again");
                 }
             } previousGuess = mostRecentGuess;
        }
        System.out.println("\nIt took you " + numberOfTries + " tries!" + "\nEnding Application");
    }
}
