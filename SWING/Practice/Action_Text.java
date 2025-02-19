import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Action_Text implements ActionListener{

    static JTextField text;
    static JButton button;

    public static void main(String[] args) throws InterruptedException {
        
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());


        text = new JTextField(20);
        button = new JButton("Click");
        button.addActionListener(new Action_Text());


        frame.add(text);
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.pack();
    }

    public void actionPerformed(ActionEvent e) {
        text.setText("Clicked");
    }
}
