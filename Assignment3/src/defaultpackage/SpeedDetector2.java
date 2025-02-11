package defaultpackage;

/*
 * SpeedDetector2 By NayranPalacios
 */

import javax.swing.JOptionPane;

public class SpeedDetector2 {
    public static void main(String[] args) {
    	
        //this shows the input dialog to get speed
        String speedInput = JOptionPane.showInputDialog(null, 
            "Please enter your speed", 
            "Input", 
            JOptionPane.QUESTION_MESSAGE);
        
        try {
            // converts the input to a integer
            int speed = Integer.parseInt(speedInput);
            
            // Shows the speed value in a message dialog
            JOptionPane.showMessageDialog(null, 
                "Your speed is " + speed, 
                "Message", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Checks speed and show the proper message 
            if (speed > 60) {
                JOptionPane.showMessageDialog(null, 
                    "Slow down! Drive safe.", 
                    "Ticket warning", 
                    JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Congratulations! You are a safe driver.", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Shows error message if input is not a valid number
            JOptionPane.showMessageDialog(null, 
                "Please enter a valid number.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}