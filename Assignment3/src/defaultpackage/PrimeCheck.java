/*
 * PrimeCheck by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Displays the introduction
        System.out.println("This program will tell you if the number you enter is prime or not");
        System.out.println("You can enter 0 anytime to stop the program");
        
        while (true) {
            // prompts for the input
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            
            // Checks if we want to exit
            if (number == 0) {
                System.out.println("0 is not prime");
                break;
            }
            
            // Prints the result
            if (isPrime(number)) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int n) {
        // Handles special cases
        if (n <= 1) {
            return false;
        }
        
        // Checks for divisibility up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}