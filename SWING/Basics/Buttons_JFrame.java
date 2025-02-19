import java.awt.*;
import java.awt.event.ActionListener;

// For Button to Work anything we want Actionlistener
// Its Functional Interface that we can use Lambda Expression

import javax.swing.*;

class Myframe extends JFrame {

    JButton button;
    JLabel label;

    Myframe() {

        ImageIcon image = new ImageIcon("Demo.jpg");

        label = new JLabel(image);
        label.setVisible(false);
        label.setBounds(100, 100, 100, 50);

        button = new JButton("Click");
        button.setBounds(100, 100, 100, 50);

        // button.addActionListener(e -> System.out.println("Poo"));
        button.addActionListener(e -> label.setVisible(true));

        button.setLocation(200, 100);
        // button.setIcon(image);
        button.setHorizontalAlignment(JButton.RIGHT);
        button.setFocusable(false);
        button.setFont(new Font("comic sans", Font.BOLD, 20));
        button.setForeground(Color.red);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(Myframe.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

}

public class Buttons_JFrame {
    public static void main(String[] args) {

        Myframe frame = new Myframe();

    }
}
