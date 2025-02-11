/*
 * PasswordGenerator by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
    	
        try (Scanner input = new Scanner(System.in)) {
			// Asks for a password length
			System.out.println("How many digits do you want to use for a numeric password?");
			int length = input.nextInt();
			
			// generates your password
			System.out.println("Your password is");
			
			// Generates each digit randomly
			for (int i = 0; i < length; i++) {
			    int digit = (int)(Math.random() * 10);  // Generates a number between 0 and 9
			    System.out.print(digit + " ");
			}
		}
        
        // adds the final newline
        System.out.println();
    }
}