/*
 * MultiplesOfTen by NayranPalacios
 */

package defaultpackage;

public class MultiplesOfTen {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000; i += 10) {
            // prints the current number with proper spacing
            System.out.printf("%-4d", i);
            
            // If we've printed 10 numbers, it will start a new line
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}