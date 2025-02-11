/*
 * Mersenne by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class Mersenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // displays the introduction and gets the input
        System.out.println("Enter a number. The System will find all the Mersenne prime numbers smaller than this number.");
        int limit = scanner.nextInt();
        
        int count = 0;          // it counts for number of Mersenne primes found
        int numbersPerLine = 5; // How many numbers to print per line
        int currentColumn = 0;  // Tracks current column for formatting
        
        // Checks of the each value of n until 2^n - 1 exceeds the limit
        int n = 2;  // Starts with n=2 since 2^1-1 = 1 is not prime
        while (true) {
            // Calculates the Mersenne number (2^n - 1)
            long mersenne = (long)Math.pow(2, n) - 1;
            
            // Stops if exceeded the limit
            if (mersenne > limit) {
                break;
            }
            
            // Checks if this Mersenne number is a prime
            if (isPrime(mersenne)) {
                // Print the Mersenne prime
                System.out.print(mersenne);
                count++;
                currentColumn++;
                
                // Adds the appropriate spacing
                if (currentColumn == numbersPerLine) {
                    System.out.println(); 
                    currentColumn = 0;    // Resets column counter
                } else {
                    System.out.print("\t"); 
                }
            }
            
            n++;
        }
        
        // Print final newline if we haven't just done so
        if (currentColumn != 0) {
            System.out.println();
        }
        
        // Print the total count
        System.out.println("There are a total of " + count + " Mersenne prime numbers");
        
        scanner.close();
    }
    
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        
        // Check for divisibility up to square root of n
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
