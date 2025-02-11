/*
 * GuessTheNumber by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // generates a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guessCount = 0;
        
        // Displays initial prompt
        System.out.println("Guess a number between 1 and 100");
        
        while (true) {
            // Gets the player's guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            guessCount++;
            
            // Checks if the guess is correct
            if (guess == numberToGuess) {
                System.out.println("Yes, the number is " + numberToGuess);
                System.out.println("You guessed the correct number in " + guessCount + " guesses");
                break;
            }
            // Gives hint if guess is wrong
            else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
        
        // Closes scanner
        scanner.close();
    }
}