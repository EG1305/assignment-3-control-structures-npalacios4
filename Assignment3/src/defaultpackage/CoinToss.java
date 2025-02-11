/*
 * CoinToss by NayranPalacios
 */

package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    
    public static void main(String[] args) {
        // asks for a number of tosses
        System.out.println("How many coin tosses do you need?");
        int numberOfTosses = scanner.nextInt();
        
        // Prints the confirmation message
        System.out.println("Now I will toss the coin " + numberOfTosses + " times.");
        
        //the variables to keep track of results
        int headsCount = 0;
        int tailsCount = 0;
        
        // performs the coin tosses
        for (int i = 0; i < numberOfTosses; i++) {
            // Generates random boolean (true for heads, false for tails)
            boolean isHeads = random.nextBoolean();
            
            // Prints the results
            System.out.print("Toss:\t");
            if (isHeads) {
                System.out.println("heads");
                headsCount++;
            } else {
                System.out.println("tails");
                tailsCount++;
            }
        }
        
        // Prints the final counts
        System.out.println("Heads facing up: " + headsCount);
        System.out.println("Tails facing up: " + tailsCount);
        
        // Closes the scanner
        scanner.close();
    }
}