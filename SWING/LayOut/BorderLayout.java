// BorderLayout places components into 5 areas
// north,south,centre,east,west 
// All Extra Space is placed in the centre area

import javax.swing.*;
import java.awt.*;

public class BorderLayout {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.blue);
        p3.setBackground(Color.gray);
        p4.setBackground(Color.lightGray);
        p5.setBackground(Color.pink);

        p1.setPreferredSize(new Dimension(100, 100));
        p2.setPreferredSize(new Dimension(100, 100));
        p3.setPreferredSize(new Dimension(100, 100));
        p4.setPreferredSize(new Dimension(100, 100));
        p5.setPreferredSize(new Dimension(100, 100));

        myFrame.setLayout(new java.awt.BorderLayout(10, 10));

        myFrame.add(p1, new java.awt.BorderLayout().NORTH);
        myFrame.add(p2, new java.awt.BorderLayout().SOUTH);
        myFrame.add(p3, new java.awt.BorderLayout().CENTER);
        myFrame.add(p4, new java.awt.BorderLayout().EAST);
        myFrame.add(p5, new java.awt.BorderLayout().WEST);

        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);

    }
}