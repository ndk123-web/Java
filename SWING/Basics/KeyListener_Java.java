import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class Myframe extends JFrame implements KeyListener {

    JLabel label;

    Myframe() {

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Keytyped and keypress doing same
    // Keytype get char and Keypress get Keycode

    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 5, label.getY());
                break;

            case 'd':
                label.setLocation(label.getX() + 5, label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(), label.getY() - 5);
                break;

            case 's':
                label.setLocation(label.getX(), label.getY() + 5);
                break;
        }

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 37:
                label.setLocation(label.getX() - 5, label.getY());
                break;

            case 38:
                label.setLocation(label.getX() + 5, label.getY());
                break;

            case 39:
                label.setLocation(label.getX(), label.getY() - 5);
                break;

            case 40:
                label.setLocation(label.getX(), label.getY() + 5);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        // System.out.println("Charcater Entered : " + e.getKeyChar());
        // System.out.println("Charcater Entered : " + e.getKeyCode());
    }

}

public class KeyListener_Java {
    public static void main(String[] args) {

        new Myframe();

    }
}
