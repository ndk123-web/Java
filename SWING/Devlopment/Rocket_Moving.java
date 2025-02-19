import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Rocket extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon rocket;

    public Rocket() {

        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        rocket = new ImageIcon("Rocket.png");

        // Scale the image to 100x100 pixels
        Image scaledImage = rocket.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label = new JLabel();
        label.setIcon(scaledIcon);
        label.setBounds(100, 100, 100, 100);

        this.addKeyListener(this);
        this.add(label);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;

            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
        }

    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

}

public class Rocket_Moving {
    public static void main(String[] args) {
        new Rocket();
    }
}
