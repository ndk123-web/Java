import javax.swing.*;
import java.awt.*;

class Demo extends JFrame {
    public Demo() {
        // Set the title of the JFrame
        super("Swing Demo");

        // Set the layout manager to null
        this.setLayout(null);

        // Create a button
        JButton b = new JButton("Click me !");
        b.setBounds(200, 200, 100, 50); // Set position (x, y) and size (width, height)

        // Add button to the JFrame
        this.add(b);

        // Set size of the JFrame
        this.setSize(500, 500);

        // Set default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set location of the JFrame
        this.setLocation(500, 500);

        // Make the JFrame visible
        this.setVisible(true);
    }
}

public class Chatgpt {
    public static void main(String[] args) {
        // Create an instance of the Demo class
        new Demo();
    }
}
