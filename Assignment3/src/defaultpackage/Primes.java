/*
 * Primes by NayranPalacios
 */


package defaultpackage;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Displays the introduction and gets the input
        System.out.println("Enter a number. The System will find all the prime number smaller than this number.");
        int limit = scanner.nextInt();
        
        int count = 0;          // The counter for the number of primes found
        int numbersPerLine = 8; // checks how many numbers to print per line
        int currentColumn = 0;  // Tracks the current column for formatting
        
        // Checks each number up to the limit
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                // prints the prime number
                System.out.print(num);
                count++;
                currentColumn++;
                
                // Adds the appropriate spacing
                if (currentColumn == numbersPerLine) {
                    System.out.println(); // New line
                    currentColumn = 0;    // Resets column counter
                } else {
                    System.out.print("\t"); // Tab between numbers
                }
            }
        }
        
        // Prints the final newline if we haven't just done so
        if (currentColumn != 0) {
            System.out.println();
        }
        
        // Print the total count
        System.out.println("There are a total of " + count + " prime numbers");
        
        scanner.close();
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        // Checks for the divisibility up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}