import java.awt.*;
import javax.swing.*;

public class PasswordField_JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JPasswordField passfield = new JPasswordField(20);
        passfield.setBounds(100, 100, 100, 50);

        frame.add(passfield);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setBackground(new Color(123, 50, 230));
        frame.setVisible(true);

    }
}
