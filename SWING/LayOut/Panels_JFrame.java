import javax.swing.*;
import java.awt.*;

public class Panels_JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        ImageIcon icon = new ImageIcon("Demo.jpg");
        JLabel label = new JLabel(icon);

        JPanel blackpanel = new JPanel();
        blackpanel.setBackground(Color.BLACK);
        blackpanel.setBounds(0, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250, 0, 250, 250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 250, 500, 250);

        redPanel.add(label); // can add labels
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(blackpanel);
        frame.add(greenPanel);
        frame.add(redPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
