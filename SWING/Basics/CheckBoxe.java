
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkbox;

    public Myframe() {

        checkbox = new JCheckBox("I am not a Robot");

        button = new JButton("Submit");
        button.addActionListener(this);

        // checkBox also can change Image Icon in place of checkBox

        this.add(button);
        this.add(checkbox);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected());
        }
    }

}

public class CheckBoxe {

    public static void main(String[] args) {

        // JCheckBox is GUI can selected or De-s elected

        new Myframe();

    }

}
