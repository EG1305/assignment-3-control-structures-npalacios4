/*
 * FindSquareRoot by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // displays the introduction
        System.out.println("The program will find the square root of a number");
        System.out.println("Enter a positive integer");
        
        // Gets the number from us
        int n = scanner.nextInt();
        
        // Initializes variables
        double lastGuess = 1.0;  // Initial guess value
        double nextGuess;
        int iterations = 0;
        
        // Iteratively calculates the square root
        do {
            iterations++;
            nextGuess = (lastGuess + n / lastGuess) / 2;
            
            // If the difference is small enough, it find the answer
            if (Math.abs(nextGuess - lastGuess) < 0.000001) {
                break;
            }
            
            lastGuess = nextGuess;
            
        } while (true);
        
        // Prints the results
        System.out.printf("The square root of %d is %.12f%n", n, nextGuess);
        System.out.printf("The program found the result in %d iterations%n", iterations);
        
        scanner.close();
    }
}