import java.awt.*;
import javax.swing.*;

class Myframe extends JFrame {

    Myframe() {

        // super("hello"); // title using superclas
        this.setVisible(true); // Set Frame visible
        this.setSize(400, 500); // set the size of Frame

        this.setTitle("Ndk");
        this.setResizable(false); // cant be resize anymore

        ImageIcon image = new ImageIcon("Demo.jpg");
        this.setIconImage(image.getImage()); // Change Icon

        // this.getContentPane().setBackground(new Color(0x000000));
        this.getContentPane().setBackground(new Color(255, 255, 255));

        // this.pack();

    }

}

public class Basics_JFrame {
    public static void main(String[] args) {

        /*
         * JFrame frame = new JFrame(); // GUI creates where components can add
         * 
         * frame.setVisible(true); // Set Frame visible
         * frame.setSize(400, 500); // set the size of Frame
         * 
         * frame.setTitle("Ndk");
         * frame.setResizable(false); // cant be resize anymore
         * 
         * ImageIcon image = new ImageIcon("19712bc412ecc4ed499d7846f9c80347.jpg");
         * frame.setIconImage(image.getImage()); // Change Icon
         * 
         * frame.getContentPane().setBackground(new Color(0x000000));
         */

        // new Myframe();

        Myframe myframe = new Myframe();

    }
}
