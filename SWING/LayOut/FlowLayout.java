// FlowLayout arranges components in a left-to-right flow, much like words on a page.// 
// When one row is filled, it automatically starts a new row
// You can specify alignment (LEFT, CENTER, or RIGHT)

/* Arrangement:

BorderLayout: Divides the container into five regions (NORTH, SOUTH, EAST, WEST, CENTER). Each region can contain only one component.
FlowLayout: Places components in a line, starting a new row if there's not enough horizontal space.
Alignment:

BorderLayout: Components are stretched to fill the entire region they're assigned to.
FlowLayout: Components are Graligned according to the specified alignment (left, center, right).
Use Cases:

BorderLayout: Best for structured layouts with distinct areas (e.g., a header, footer, sidebar, and main content area).
FlowLayout: Best for simple layouts where components should flow in a natural reading order, like in forms or toolbars.  */

import java.awt.*;
import javax.swing.*;

public class FlowLayout {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();

        JPanel form = new JPanel();

        form.setLayout(new java.awt.FlowLayout());
        form.setBackground(Color.gray);
        form.setPreferredSize(new Dimension(100, 250));

        myFrame.setLayout(new java.awt.FlowLayout());

        form.add(new JButton("1"));
        form.add(new JButton("2"));
        form.add(new JButton("3"));
        form.add(new JButton("4"));
        form.add(new JButton("5"));
        form.add(new JButton("6"));

        myFrame.add(form);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);

    }
}