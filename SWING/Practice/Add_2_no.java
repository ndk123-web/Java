import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener {

    JButton b1;
    JTextField t1,t2,t3;
    JFrame frame;
     Myframe(){

        frame = new JFrame();
        b1= new JButton("Add");

        t1=new JTextField(5);
        t2=new JTextField(5);
        t3=new JTextField(5);

        b1.addActionListener(this);

        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(t3);

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String a = t1.getText();
        String b = t2.getText();

        int an = Integer.parseInt(a) + Integer.parseInt(b);
        t3.setText(" "+an);
    }
}

public class Add_2_no {
    public static void main(String[] args) {
        
       Myframe frame = new Myframe();
    }   
}
