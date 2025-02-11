/*
 * ThousandNumbers by NayranPalacios
 */

package defaultpackage;

public class ThousandNumbers {
    public static void main(String[] args) {
        int number = 1;
        
        while (number <= 1000) {
            // Printing the current number with the proper spacing
            System.out.printf("%-4d", number);
            
            // If we've printed 10 numbers, it will start a new line
            if (number % 10 == 0) {
                System.out.println();
            }
            
            number++;
        }
    }
}