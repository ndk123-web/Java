import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    ImageIcon smile, happy, upward, weird;

    public MyFrame() {

        smile = new ImageIcon("smiling.jpeg");
        happy = new ImageIcon("Happy.png");
        weird = new ImageIcon("Weird.png");
        upward = new ImageIcon("upwand.webp");

        label = new JLabel();
        label.setBounds(0, 0, 800, 800);
        label.setIcon(upward);
        label.addMouseListener(this); // this is Important

        this.add(label);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    public void mouseClicked(MouseEvent e) {
        label.setIcon(smile);
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        label.setIcon(weird);

    }

    public void mouseEntered(MouseEvent e) {
        label.setIcon(happy);

    }

    public void mouseExited(MouseEvent e) {
        label.setIcon(upward);
    }

}

public class MouseListener_Emoji {
    public static void main(String[] args) {

        new MyFrame();

    }
}
