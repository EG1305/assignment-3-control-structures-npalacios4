/*
 * PINCheck by NayranPalacios
 */


package defaultpackage;

import java.util.Scanner;

public class PINCheck {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        checkPIN();
    }
    
    public static void checkPIN() {
        // gets the initial PIN
        System.out.println("Please enter your PIN");
        String originalPIN = scanner.nextLine();
        
        // Asks for a confirmation
        System.out.println("Please confirm your PIN");
        String confirmPIN = scanner.nextLine();
        
        // If the confirmation doesn't match, it will treat it as a failed attempt
        if (!originalPIN.equals(confirmPIN)) {
            System.out.println("Incorrect PIN. Try again");
        }
        
        // will keep asking until the correct PIN is entered
        while (true) {
            System.out.println("Enter your PIN");
            String attempt = scanner.nextLine();
            
            // Checks if the PIN matches the original
            if (attempt.equals(originalPIN)) {
                System.out.println("PIN accepted. You can access your account");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again");
            }
        }
        
        // Closes the scanner
        scanner.close();
    }
}