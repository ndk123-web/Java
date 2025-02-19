import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

class Myframe extends JFrame {

    JFrame frame;
    JProgressBar bar;

    Myframe() {
        // Create a new JFrame with the default constructor
        frame = new JFrame();

        // Initialize the JProgressBar with a minimum value of 0 and a maximum value of 100
        bar = new JProgressBar(0, 100);

        // Enable string painting, which shows the progress percentage as a string inside the progress bar
        bar.setStringPainted(true);

        // Set the preferred size of the progress bar
        bar.setPreferredSize(new Dimension(400, 50));

        // Set the font for the text inside the progress bar
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));

        // Set the foreground color of the progress bar (the color of the filled portion)
        bar.setForeground(Color.green);

        // Set the background color of the progress bar (the color of the unfilled portion)
        bar.setBackground(Color.BLACK);

        // Add the progress bar to the frame
        frame.add(bar);

        // Set the layout of the frame to FlowLayout
        frame.setLayout(new FlowLayout());

        // Set the default close operation to exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

        // Pack the frame to fit the preferred sizes of its components
        frame.pack();

        // Start filling the progress bar
        this.fill();
    }

    // Method to fill the progress bar
    public void fill() {
        // Initialize the counter to 100
        int c = 100;

        // Decrement the counter from 100 to 0
        while (c != 0) {
            try {
                // Set the current value of the progress bar
                bar.setValue(c--);

                // Pause for 50 milliseconds to simulate progress
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // Print any exception that occurs
                System.out.println(e.getLocalizedMessage());
            }
        }

        // Set the string to "Done !" once the progress reaches 0
        bar.setString("Done !");
    }

}

public class ProgressBar {
    public static void main(String[] args) {
        // Create an instance of Myframe, which sets up the GUI and starts the progress bar
        new Myframe();
    }
}
