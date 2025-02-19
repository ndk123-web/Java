import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Frame extends JFrame implements ActionListener{

    JButton button[] = new JButton[20]; 
    JTextField text;
    Frame(){

        text = new JTextField();
        text.setLayout(null);
        text.setBounds(0, 0, 420, 50);
        text.setCaretPosition(text.getText().length());

        this.add(text);
        this.setLayout(new GridLayout(5,4 ,2 ,2));
        this.setSize(420,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}

public class Calculator {
    public static void main(String[] args) {
        new Frame();
    }
}
