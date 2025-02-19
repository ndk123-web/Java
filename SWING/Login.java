import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class Myframe extends JFrame {

    JPanel panel;
    JTextField text;
    JPasswordField pass;
    JLabel l1, l2;
    JButton button;

    Myframe() {
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.GRAY);

        panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBackground(Color.GRAY);

        l1 = new JLabel("Enter Username");
        l2 = new JLabel("Enter Password");
        text = new JTextField(20); // Adjust columns for preferred width
        pass = new JPasswordField(20); // Adjust columns for preferred width
        button = new JButton("Login");
        button.addActionListener(e -> {
            String u = text.getText();
            String p = new String(pass.getPassword());

            if (u.isEmpty() || p.isEmpty()) {
                System.out.println("Its Empty");
            } else {
                System.out.println("Log in Successfully");
            }
        });

        panel.add(l1);
        panel.add(text);
        panel.add(l2);
        panel.add(pass);
        panel.add(button);

        this.add(panel, BorderLayout.CENTER); // Adding panel to center

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // Adjusting frame size based on contents
        this.setLocationRelativeTo(null); // Centering frame
        this.setVisible(true);
    }

}

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Myframe();
        });
    }
}
