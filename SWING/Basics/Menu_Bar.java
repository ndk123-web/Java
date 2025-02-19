import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Myframe extends JFrame implements ActionListener {

    JMenuBar menu;
    JMenu filemenu, loadmenu, helpmenu;
    JMenuItem saveitem, exititem, loadItem;

    Myframe() {
        setTitle("Menu Bar Example");

        // Create menu bar
        menu = new JMenuBar();

        // Create menus
        filemenu = new JMenu("File");
        loadmenu = new JMenu("Edit");
        helpmenu = new JMenu("Help");

        // Create menu items
        loadItem = new JMenuItem("Load");
        exititem = new JMenuItem("Exit");
        saveitem = new JMenuItem("Save");

        // Add action listener to handle events
        loadItem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);

        // Add menus to menu bar
        menu.add(filemenu);
        menu.add(loadmenu);
        menu.add(helpmenu);

        // Add menu items to File menu
        filemenu.add(loadItem);
        filemenu.add(saveitem);
        filemenu.add(exititem);

        // Set menu bar for the frame
        setJMenuBar(menu);

        setSize(500, 500); // Set size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        setLayout(new FlowLayout(FlowLayout.LEFT)); // Set layout manager

        setVisible(true); // Make the frame visible
    }

    public void actionPerformed(ActionEvent e) {
        // Handle menu item clicks
        if (e.getSource() == loadItem) {
            System.out.println("Loaded !!");
            // Add your logic here for 'Load' action
        } else if (e.getSource() == saveitem) {
            System.out.println("Saved !!");
            // Add your logic here for 'Save' action
        } else if (e.getSource() == exititem) {
            System.out.println("Exited !!");
            // Add your logic here for 'Exit' action
        }
    }

}

public class Menu_Bar {
    public static void main(String[] args) {
        // Create and display the JFrame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Myframe();
            }
        });
    }
}
