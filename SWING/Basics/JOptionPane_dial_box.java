// Its a type of Dialogue Box (JOptionPane)
// JOptionPane.showOptionDialog(null, args, null, 0, 0, null, args, args)
// JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue);

// OptionDialogue int value return krta hai
// InputDialougue mein input leta hai 

import javax.swing.*;
import java.awt.*;

public class JOptionPane_dial_box {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "How r u", "Title",
        // JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "How r u", "Title",
        // JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showMessageDialog(null, "How r u", "Title",
        // JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "How r u", "Title",
        // JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "How r u", "Title",
        // JOptionPane.PLAIN_MESSAGE);

        // String[] options = { "Cool ! ", "Amaze ", "Blush" };

        // JOptionPane.showOptionDialog(null, "Hey Bro", "Title",
        // JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, null, options,
        // null);

        String name = JOptionPane.showInputDialog("What s ur name ? ");
        System.out.println("Hello " + name);

        System.out.println(JOptionPane.showOptionDialog(null, "How r u", "Title", JOptionPane.YES_NO_CANCEL_OPTION, 0,
                null, null, null));

        // Yes (Returns 0)
        // No (Returns 1)
        // Cancel (Returns 2)
        // Close (Returns -1)
    }
}
