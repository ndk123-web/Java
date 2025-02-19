// 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Create_Form implements ActionListener {
    static JLabel l1,l2,l3,l4,l5,l6;
    static JTextField t1,t2,t3,t4,t5;
    static JButton button;
    static JTextArea area;
    static JComboBox<Integer> j3,j2,j1;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        
        
        j1 = new JComboBox<>();
        for(int i=1;i<=31;i++)
        j1.addItem(i);

        j2 = new JComboBox<>();
        for(int i=1;i<=31;i++)
        j2.addItem(i);

        j3 = new JComboBox<>();
        for(int i=1990;i<=2024;i++)
        j3.addItem(i);

        area = new JTextArea();

        button = new JButton("Enter");

        l1=new JLabel("Enter Name");
        l2=new JLabel("Enter Surname");
        l3=new JLabel("Email");
        l4=new JLabel("Contact No.");
        l5=new JLabel("Address");
        l6=new JLabel("Date");

        t1= new JTextField(20);
        t2= new JTextField(20);
        t3= new JTextField(20);
        t4= new JTextField(20);
        t5= new JTextField(20);

        frame.setLayout(null);

        l1.setBounds(100,100, 100, 20);
        t1.setBounds(200, 100, 125, 20);
        l2.setBounds(100,130, 100, 20);
        t2.setBounds(200, 130, 125, 20);
        l3.setBounds(100,160, 100, 20);
        t3.setBounds(200, 160, 125, 20);
        l4.setBounds(100,190, 100, 20);
        t4.setBounds(200, 190, 125, 20);
        l5.setBounds(100,220, 100, 20);
        t5.setBounds(200, 220, 125, 20);
        l6.setBounds(100,250, 100, 20);
        j1.setBounds(200,250, 50, 20);
        j2.setBounds(260,250, 50, 20);
        j3.setBounds(320,250, 70, 20);
        area.setBounds(450, 100, 200, 300);
        button.setBounds(250,300,100,30);
        button.addActionListener(new Create_Form());

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        frame.add(l5);
        frame.add(t5);
        frame.add(l6);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(area);
        frame.add(button);

        frame.getContentPane().setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,500);
        
    }

    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String sn = t2.getText();
        String em = t3.getText();
        String addr = t4.getText();
        int dob_1 = (Integer)j1.getSelectedItem();
        int dob_2 =(Integer)j2.getSelectedItem();
        int dob_3 =(Integer)j3.getSelectedItem();

        String output = "Name: " + name + "\n" +
        "Surname: " + sn + "\n" +
        "Email: " + em + "\n" +
        "Address: " + addr + "\n" +
        "DOB: " + dob_1+"/"+dob_2+"/"+dob_3;
        
        area.setText(output);
        
    }
}
