import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Myframe extends JFrame implements MouseListener {

    JLabel label;

    public Myframe() {

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.setSize(500, 500);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked Mouse");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed Mouse");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Released Mouse");

    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered Area of Label ");

    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Exited Area of Label ");

    }

}

public class MouseListner_java {
    public static void main(String[] args) {
        new Myframe();
    }
}
