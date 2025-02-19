import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;

class Mypanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    int xvelocity = 2;
    int yvelocity = 1;
    int x = 0;
    int y = 0;
    Image enemy;
    Timer timer;

    Mypanel() {
        // Set the preferred size of the panel
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        // Load the enemy image
        enemy = new ImageIcon("Enemy.png").getImage();

        // Initialize the timer to call actionPerformed every 10 milliseconds
        timer = new Timer(10, this);
        // Start the timer
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        // Call the superclass's paint method to ensure proper painting
        super.paint(g);

        // Cast Graphics to Graphics2D for more advanced operations
        Graphics2D g2d = (Graphics2D) g;

        // Draw the enemy image at the current (x, y) position
        g2d.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if the enemy has reached the edges of the panel and reverse direction
        // if so
        if (x >= PANEL_WIDTH - (enemy.getWidth(null) - 5) || x < 0) {
            xvelocity = xvelocity * -1;
        }

        // Update the x position of the enemy
        x = x + xvelocity;

        if (y >= PANEL_HEIGHT - (enemy.getHeight(null) - 5) || y < 0) {
            yvelocity = yvelocity * -1;
        }

        y = y + yvelocity;

        // Repaint the panel to reflect the new position
        repaint();
    }
}

class Myframe extends JFrame {

    Mypanel panel;

    Myframe() {
        // Create a new Mypanel instance
        panel = new Mypanel();

        // Add the panel to the frame
        this.add(panel);

        // Set the default close operation to exit the application
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        this.setLocationRelativeTo(null);

        // Set the size of the frame
        this.setSize(500, 500);

        // Make the frame visible
        this.setVisible(true);
    }
}

public class Animation {
    public static void main(String args[]) {
        // Create a new instance of Myframe, which will display the window
        new Myframe();
    }
}
