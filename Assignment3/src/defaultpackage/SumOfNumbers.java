/*
 * SumOfNumbers by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// it will display the introduction
			System.out.println("This program will add all the numbers from 1 to the number you enter");
			System.out.println("Please enter a number");
			
			// gets user input
			int number = input.nextInt();
			
			// Echo the input
			System.out.println("You entered " + number);
			
			// calculates the sum using for loop
			int sum = 0;
			for (int i = 1; i <= number; i++) {
			    sum += i;
			}
			
			// displays the results
			System.out.println("The sum of all numbers from 1 to " + number + " is " + sum);
		System.exit(sum);
		}
    }
}