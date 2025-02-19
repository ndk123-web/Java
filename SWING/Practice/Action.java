import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Implementing ActionListener to handle button click events
public class Action implements ActionListener {

    // Main method to set up the GUI
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Listener Example"); // Create a new JFrame with a title

        JButton button = new JButton("Click"); // Create a new button with the label "Click"
        button.addActionListener(new Action()); // Add an instance of Action as an ActionListener to the button

        frame.setLayout(new FlowLayout()); // Set the layout manager to FlowLayout
        frame.add(button); // Add the button to the frame
        frame.setSize(500, 500); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
        frame.setVisible(true); // Make the frame visible
    }

    // Override the actionPerformed method to define what happens when the button is
    // clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked"); // Print "Clicked" to the console
    }
}
