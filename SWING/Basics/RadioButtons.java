/* In Java Swing, the ButtonGroup class is used to create a mutually 
  exclusive group of buttons. This is particularly useful when you have
 a set of radio buttons and you want to ensure that only one of them 
 can be selected at a time. When buttons are added to a ButtonGroup, 
 selecting one button will automatically deselect any previously selected button in the group  */

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener {

    JRadioButton pizzabutton;
    JRadioButton humburgerbutton;
    JRadioButton hotdogbutton;

    // using these we can add More radiobuttons but select Only once
    ButtonGroup group;

    Myframe() {

        // we can also change Image Icon
        pizzabutton = new JRadioButton("Pizza");
        humburgerbutton = new JRadioButton("Humburger");
        hotdogbutton = new JRadioButton("HotDog");

        pizzabutton.addActionListener(this);
        humburgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(humburgerbutton);
        group.add(hotdogbutton);

        this.add(hotdogbutton);
        this.add(humburgerbutton);
        this.add(pizzabutton);

        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzabutton) {
            System.out.println("Ordered Pizza");
        }
        if (e.getSource() == humburgerbutton) {
            System.out.println("Ordered Humburger");
        }
        if (e.getSource() == hotdogbutton) {
            System.out.println("Ordered HotDog");
        }
    }

}

public class RadioButtons {
    public static void main(String[] args) {
        new Myframe();
    }
}
