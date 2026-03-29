import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            }

        } while (guess != numberToGuess);

        System.out.println("Correct! Attempts: " + attempts);
        scanner.close();
    }
}
