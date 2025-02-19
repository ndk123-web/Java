import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class Myframe extends JFrame {

    JPanel panel;
    JButton clr, dele;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JTextField text;

    Myframe() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());

        panel = new JPanel(new GridLayout(4, 3, 10, 10)); // Calculator buttons panel
        panel.setBackground(Color.GRAY);

        text = new JTextField();
        text.setHorizontalAlignment(JTextField.RIGHT); // Align text to the right
        text.setEditable(false); // Make text field read-only

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        clr = new JButton("C");
        dele = new JButton("DEL");

        // Adding buttons to panel
        panel.add(text);
        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(clr);
        panel.add(dele);

        // Button action listeners
        b0.addActionListener(e -> appendNumber("0"));
        b1.addActionListener(e -> appendNumber("1"));
        b2.addActionListener(e -> appendNumber("2"));
        b3.addActionListener(e -> appendNumber("3"));
        b4.addActionListener(e -> appendNumber("4"));
        b5.addActionListener(e -> appendNumber("5"));
        b6.addActionListener(e -> appendNumber("6"));
        b7.addActionListener(e -> appendNumber("7"));
        b8.addActionListener(e -> appendNumber("8"));
        b9.addActionListener(e -> appendNumber("9"));
        clr.addActionListener(e -> clearText());
        dele.addActionListener(e -> deleteLastChar());

        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    // Method to append number to text field
    private void appendNumber(String num) {
        text.setText(text.getText() + num);
    }

    // Method to clear text field
    private void clearText() {
        text.setText("");
    }

    // Method to delete last character from text field
    private void deleteLastChar() {
        String currentText = text.getText();
        if (!currentText.isEmpty()) {
            text.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

}

public class Calc {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Myframe();
        });
    }
}
