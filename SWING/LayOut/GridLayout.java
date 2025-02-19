// Places Components in a Grid of cells

import javax.swing.*;
import java.awt.*;

public class GridLayout implements LayoutManager {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();

        myFrame.setLayout(new java.awt.GridLayout(3, 3, 5, 5));

        myFrame.add(new JButton("1"));
        myFrame.add(new JButton("2"));
        myFrame.add(new JButton("3"));
        myFrame.add(new JButton("4"));
        myFrame.add(new JButton("5"));
        myFrame.add(new JButton("6"));
        myFrame.add(new JButton("7"));
        myFrame.add(new JButton("8"));
        myFrame.add(new JButton("9"));
        myFrame.add(new JButton("10"));

        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
    }
}
