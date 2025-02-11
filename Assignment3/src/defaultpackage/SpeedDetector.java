/*
 * SpeedDetector By NayranPalacios
 */

package defaultpackage;

import javax.swing.JOptionPane;

public class SpeedDetector {
    public static void main(String[] args) {
        // it will show the input dialog to get speed
        String speedInput = JOptionPane.showInputDialog(null, 
            "Please enter your speed", 
            "Input", 
            JOptionPane.QUESTION_MESSAGE);
        
        try {
            // it converts the input to a integer
            int speed = Integer.parseInt(speedInput);
            
            // Show the speed value in a message dialog
            JOptionPane.showMessageDialog(null, 
                "Your speed is " + speed, 
                "Message", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // checks if the speed is greater than 60
            if (speed > 60) {
                JOptionPane.showMessageDialog(null, 
                    "Slow down! Drive safe.", 
                    "Ticket warning", 
                    JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // this will show the error message if input is not a valid number
            JOptionPane.showMessageDialog(null, 
                "Please enter a valid number.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}