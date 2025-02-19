import javax.swing.*;
import java.awt.*;

class Myframe extends JFrame {

    JButton login;
    JLabel l1, l2;
    JTextField text;
    JPasswordField password;

    public Myframe() {

        this.getContentPane().setBackground(Color.GRAY);

        JPanel form = new JPanel(new GridLayout(2, 2, 2, 2));
        form.setBackground(Color.GRAY); // Set background color for form panel
        JPanel butt = new JPanel(new FlowLayout());
        butt.setBackground(Color.GRAY); // Set background color for button panel

        l1 = new JLabel("Enter Username");
        l1.setForeground(Color.WHITE); // Set text color for label
        text = new JTextField(10);

        l2 = new JLabel("Enter Password");
        l2.setForeground(Color.WHITE); // Set text color for label
        password = new JPasswordField(10);

        login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 25)); // Set preferred size

        form.add(l1);
        form.add(text);
        form.add(l2);
        form.add(password);

        butt.add(login);

        this.setLayout(new BorderLayout());
        this.add(form, BorderLayout.CENTER);
        this.add(butt, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 150);

        this.setVisible(true);
        this.setLocation(500, 500);
    }

}

public class Login_Page {
    public static void main(String[] args) {
        new Myframe();
    }
}
