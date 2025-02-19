// Login Page 
// Need 2 Label 1 text 1 pass and 1 button

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem1{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Login Page");
        JTextField text = new JTextField(20);
        JPasswordField pass = new JPasswordField(20);
        JLabel l1 = new JLabel("Enter Username");
        JLabel l2 = new JLabel("Enter Password");
        JButton button = new JButton("Login");

        frame.add(l1);
        frame.add(text);
        frame.add(l2);
        frame.add(pass);
        frame.add(button);

        frame.getContentPane().setBackground(Color.gray);
        frame.setSize(350,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
    
    }
}