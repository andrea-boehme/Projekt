package aufgabe6;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    static int randomNumber = ThreadLocalRandom.current().nextInt(0, 100 +1);

    public static void main(String args[]) {
        newGuess();
    }

    public static void newGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess number between 0 and 100: ");
        int number = scanner.nextInt();
        guess(number);
    }

    public static void guess( int number) {
        if(number == randomNumber) {
            System.out.println("Richtig geraten");
        } else if(number < randomNumber) {
            System.out.println("Bitte höhere Zahl raten");
        } else if(number > randomNumber) {
            System.out.println("Bitte niedrigere Zahl raten");
        }
        newGuess();
    }
}
