import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;

        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound +
                ". You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess a number between " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            int score = calculateScore(attempts, maxAttempts);
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }

    private static int calculateScore(int attempts, int maxAttempts) {
        int maxScore = 100;
        double scorePercentage = ((double) (maxAttempts - attempts) / maxAttempts) * maxScore;

        return (int) Math.max(0, scorePercentage);
    }
}
