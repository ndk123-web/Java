import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class New_Window extends JFrame {

    JLabel label;

    New_Window() {

        new JFrame();
        label = new JLabel("Hello!");
        label.setBounds(100, 100, 200, 500);
        label.setFont(new Font("null", Font.BOLD, 30));

        add(label);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

    }

}

class Orignal_Window extends JFrame implements ActionListener {

    JFrame orig;
    JButton button;

    Orignal_Window() {

        orig = new JFrame();
        button = new JButton("Go To New Page");
        button.setBounds(250, 250, 100, 50);
        button.addActionListener(this);

        orig.add(button);
        orig.setLayout(null);
        orig.setDefaultCloseOperation(orig.EXIT_ON_CLOSE);
        orig.setSize(500, 500);
        orig.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new New_Window();
        }
    }

}

public class Open_New_Window {
    public static void main(String[] args) {

        Orignal_Window orig = new Orignal_Window();
    }
}