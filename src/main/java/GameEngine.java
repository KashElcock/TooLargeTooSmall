import java.util.Random;
import java.util.Scanner;
public class GameEngine {
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int getMysteryNumber(){
        int mysteryNumber = new Random().nextInt(10);
        return mysteryNumber;
    }
}
