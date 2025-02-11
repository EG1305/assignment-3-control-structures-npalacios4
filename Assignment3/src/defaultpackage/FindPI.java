/*
 * FindPI by NayranPalacios
 */

package defaultpackage;

import java.util.Scanner;

public class FindPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Displays the introduction
        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.println("How many iterations should we use? Please enter an integer");
        
        // Gets the number of iterations from us
        int iterations = scanner.nextInt();
        
        // Records a start time
        long startTime = System.currentTimeMillis();
        
        // Calculate PI using the Leibniz formula
        double pi = 0;
        for (int i = 0; i < iterations; i++) {
            // Using the formula: π/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ....
            pi += Math.pow(-1, i) / (2.0 * i + 1);
        }
        pi *= 4; // Because of the series converges to π/4
        
        // Records the end time
        long endTime = System.currentTimeMillis();
        
        // Calculates elapsed time in seconds
        double elapsedTime = (endTime - startTime) / 1000.0;
        
        // Prints the results
        System.out.printf("PI = %.15f%n", pi);
        System.out.printf("After %d iterations.%n", iterations);
        System.out.printf("This operation took %.2f seconds.%n", elapsedTime);
        
        scanner.close();
    }
}