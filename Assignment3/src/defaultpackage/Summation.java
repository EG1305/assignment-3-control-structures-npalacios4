/*/
 * Summation by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int sum = 0;
			int number;
			
			// Displays the introduction
			System.out.println("This program will add all the numbers you enter");
			System.out.println("Enter 0 for me to stop adding");
			
			do {
			    // Gets the user input
			    number = input.nextInt();
			    
			    // Echo the input
			    System.out.println("You entered " + number);
			    
			    // adds to the sum
			    sum += number;
			    
			    // displays running sum
			    System.out.println("The sum is " + sum);
			    
			} while (number != 0);
			
			// Displays the final sum
			System.out.println("The sum of all the numbers you entered is " + sum);
		}
    }
}
