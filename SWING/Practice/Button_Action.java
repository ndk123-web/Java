import javax.swing.*;
import java.awt.event.*;
import java.io.UncheckedIOException;
import java.awt.*;

public class Button_Action implements ActionListener {

    static JButton b1,b2;

    public static void main(String[] args) throws UnsupportedOperationException {
        
        JFrame frame = new JFrame();
        b1=new JButton();
        b2=new JButton();
        Button_Action obj = new Button_Action();

        b1.addActionListener(obj);
        b2.addActionListener(obj);

        frame.add(b1);
        frame.add(b2);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1 )
        b1.setLabel("O");
        if(e.getSource() == b2)
        b2.setLabel("X");
    }   
}
