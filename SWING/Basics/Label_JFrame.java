import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Label_JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("Demo.jpg");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        label.setText("Bro how Are u ?");
        label.setIcon(image);

        // label.setHorizontalTextPosition(JLabel.LEFT); // Left,right,centre can move

        label.setVerticalTextPosition(JLabel.TOP); // top,centre,bottom can move label
        label.setForeground(new Color(123, 50, 230)); // Colour of Text (Label)
        label.setFont(new Font("MV Boli", Font.BOLD, 13)); // Set Font of Text(label)

        label.setIconTextGap(20); // Gap btw image and Text(label)

        label.setBackground(Color.white); // set backround color of label
        label.setOpaque(true); // display backround color of label

        label.setBorder(border); // sets Border of Frame

        // label.setHorizontalAlignment(JLabel.CENTER); // left,right,Centre
        // move(text+icon)
        label.setVerticalAlignment(JLabel.TOP); // Top,Bottom,Centr move (text+icon)

        label.setBounds(0, 0, 250, 250); // Components ko set krne mein use hota hai like (JLabel)

        frame.setSize(500, 500);
        // frame.setLayout(null); // Layout is null
        frame.add(label);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // Automatically Frame and Components Resize hota hai
        // Make sure to add all components and then add pack method
        frame.pack();

    }
}
