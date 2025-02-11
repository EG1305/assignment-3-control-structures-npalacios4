/*
 * RiceChessboard by NayranPalacios
 */

package defaultpackage;

public class RiceChessboard {
    public static void main(String[] args) {
        // Uses a long data type since numbers will be very large
        long square64 = 0;
        long totalRice = 0;
        
        // calculates rice on each square and keep running total
        for (int square = 1; square <= 64; square++) {
            // Calculates the rice on current square (2^(square-1))
            long riceOnSquare = 1L << (square - 1);
            
            // Adds to the total
            totalRice += riceOnSquare;
            
            // If the square is 64, it stores it
            if (square == 64) {
                square64 = riceOnSquare;
            }
            
            // Prints the progress every 8 squares 
            if (square % 8 == 0) {
                System.out.println("After row " + (square / 8) + ": " + totalRice + " grains");
            }
        }
        
        // Prints the results
        System.out.println("\nResults:");
        System.out.println("Number of rice grains on square 64: " + square64);
        System.out.println("Total number of rice grains on the board: " + totalRice);
        
    }
}