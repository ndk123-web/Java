import java.awt.*;
import javax.swing.*;

public class TextField_JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        TextField_class textfield = new TextField_class(20);
        textfield.setBounds(100, 100, 100, 50);

        frame.add(textfield);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setBackground(new Color(123, 50, 230));
        frame.setVisible(true);

    }
}
