import javax.swing.JFrame;

class Demo extends JFrame {

}

public class Create_Jframe {
    public static void main(String[] args) {

        Demo jf = new Demo();

        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setLocation(300, 400);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

    }
}