import javax.swing.*;
import java.awt.*;

class Mypanel extends JPanel {

    Mypanel() {
        // Set the background color of the panel to black
        this.setBackground(Color.black);
        // Set the preferred size of the panel
        this.setPreferredSize(new Dimension(500, 500));
    }

    @Override
    public void paint(Graphics g) {
        // Ensure proper painting by calling the superclass method
        super.paintComponent(g);
        
        // Cast Graphics to Graphics2D for more advanced operations
        Graphics2D g2d = (Graphics2D) g;

        // Set the paint color to red
        g2d.setPaint(Color.red);

        // Uncomment the following lines to draw different shapes and text

        // Draw a line from (0, 0) to (500, 500)
        // g2d.drawLine(0, 0, 500, 500);

        // Change paint color to blue
        // g2d.setPaint(Color.blue);

        // Draw a rectangle at (100, 100) with width 200 and height 200
        // g2d.drawRect(100, 100, 200, 200);

        // Fill a rectangle at (100, 100) with width 200 and height 200
        // g2d.fillRect(100, 100, 200, 200);

        // Draw an oval inside the rectangle defined by (300, 300, 100, 200)
        // g2d.drawOval(300, 300, 100, 200);

        // Draw a filled arc with red color from 0 to 180 degrees
        // g2d.setPaint(Color.red);
        // g2d.fillArc(100, 100, 200, 200, 0, 180);

        // Draw a filled arc with white color from 180 to 360 degrees
        // g2d.setPaint(Color.white);
        // g2d.fillArc(100, 100, 200, 200, 180, 180);

        // Define points for a triangle
        int xpoints[] = {150, 250, 350};
        int ypoints[] = {300, 150, 300};

        // Draw a triangle (polygon) connecting the points
        g2d.drawPolygon(xpoints, ypoints, 3);

        // Draw a string at position (150, 150)
        g2d.drawString("Hey Bro !", 150, 150);
    }
}

class Myframe extends JFrame {

    Mypanel panel;

    Myframe() {
        panel = new Mypanel();

        // Set the background color of the content pane to black
        this.getContentPane().setBackground(Color.black);

        // Add the custom panel to the frame
        this.add(panel);

        // Center the frame on the screen
        this.setLocationRelativeTo(null);

        // Set the default close operation to exit the application
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the frame to fit the preferred size of its components
        this.pack();

        // Set the frame to be visible
        this.setVisible(true);
    }
}

public class Graphics_2d {
    public static void main(String args[]) {
        // Create a new instance of Myframe, which will display the window
        new Myframe();
    }
}
