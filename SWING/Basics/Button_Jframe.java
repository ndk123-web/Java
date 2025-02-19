import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

class Demo extends JFrame {

}

public class Button_Jframe {
    public static void main(String[] args) {
        Demo d = new Demo();

        JButton b = new JButton("Click me !");
        d.setLayout(null);
        b.setBounds(200, 200, 100, 50);
        d.add(b);

        d.setVisible(true);
        d.setLocation(500, 500);
        d.setSize(500, 500);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected usage of EXIT_ON_CLOSE
    }
}
