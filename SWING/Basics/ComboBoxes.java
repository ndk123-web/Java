import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.FlowLayout;

class Myframe extends JFrame implements ActionListener {

    JComboBox combo;

    Myframe() {

        // Use Wrapper Classes (String,Integer,Double)

        String animals[] = { "Dog", "Cat", "Poo" };
        combo = new JComboBox(animals);

        combo.addItem("Horse"); // Add the Boxes

        combo.insertItemAt("PeaCock", 0);

        combo.setSelectedIndex(0);

        // combo.removeAllItems();

        combo.removeItem("Cat");

        // combo.setEditable(true);
        combo.addActionListener(this);

        System.out.println(combo.getItemCount()); // Total Boxes of Combo

        this.add(combo);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combo) {
            System.out.println(combo.getSelectedItem());
        }
    }

}

public class ComboBoxes {
    public static void main(String[] args) {

        new Myframe();

    }
}
