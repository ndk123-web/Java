import javax.swing.*;
import java.awt.*;

public class Problem2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JTextField text = new JTextField(20);
        JPasswordField pass = new JPasswordField(20);
        JLabel l1 = new JLabel("Enter Username:");
        JLabel l2 = new JLabel("Enter Password:");
        JButton button = new JButton("Login");

        // Set layout manager to null for absolute positioning
        frame.setLayout(null);

        // Set bounds for each component
        l1.setBounds(50, 100, 150, 20);
        text.setBounds(200, 100, 150, 20);
        l2.setBounds(50, 150, 150, 20);
        pass.setBounds(200, 150, 150, 20);
        button.setBounds(200, 200, 100, 30);

        pass.setEchoChar('X');      // pass character fill by X

        // Add components to the frame
        frame.add(l1);
        frame.add(text);
        frame.add(l2);
        frame.add(pass);
        frame.add(button);

        // Set frame properties
        frame.getContentPane().setBackground(Color.gray);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
