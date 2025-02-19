import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.FlowLayout;

class Myframe extends JFrame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    Myframe() {
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0, 100, 50);
        slider.setPreferredSize(new Dimension(400, 150));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true); // Show labels at major tick marks
        slider.setOrientation(SwingConstants.HORIZONTAL);

        // Add ChangeListener to slider
        slider.addChangeListener(this);

        // Initialize label with the slider's initial value
        label.setText("Celsius : " + slider.getValue());

        // Add components to the panel
        panel.add(label);
        panel.add(slider);

        // Add panel to the frame
        this.add(panel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Update the label with the slider's current value whenever it changes
        label.setText("Celsius : " + slider.getValue());
    }
}

public class Slider {
    public static void main(String[] args) {
        new Myframe();
    }
}
