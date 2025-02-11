/*
 * RockPaperScissors by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			while (true) {
			    // Generates the computer's pick (0-2)
			    int computer = (int)(Math.random() * 3);
			    
			    // Gets the users pick
			    System.out.println("Enter 0, 1, or 2");
			    System.out.println("scissors (0), rock (1), paper (2):");
			    int human = input.nextInt();
			    
			    // Determines the winner using game logic
			    if (human == computer) {
			        System.out.println("Tie");
			    }
			    else if (human == 0 && computer == 2) {
			        System.out.println("You won: Scissors beats paper");
			    }
			    else if (human == 1 && computer == 0) {
			        System.out.println("You won: Rock beats scissors");
			    }
			    else if (human == 2 && computer == 1) {
			        System.out.println("You won: Paper beats rock");
			    }
			    else if (human == 0 && computer == 1) {
			        System.out.println("You lose: Rock beats scissors");
			    }
			    else if (human == 1 && computer == 2) {
			        System.out.println("You lose: Paper beats rock");
			    }
			    else if (human == 2 && computer == 0) {
			        System.out.println("You lose: Scissors beats paper");
			    }
			    
			    // Asking if they want to play again
			    System.out.println("\nEnter 0, 1, or 2");
			    System.out.println("scissors (0), rock (1), paper (2):");
			}
		}
    }
}