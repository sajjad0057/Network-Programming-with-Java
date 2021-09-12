import javax.swing.*;
import java.awt.*;

public class lab01 {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Display an image");

        ImageIcon imageIcon=new ImageIcon(lab01.class.getResource("test.png"));
        jf.add(new JLabel(imageIcon),BorderLayout.WEST);

        ImageIcon cube=new ImageIcon(lab01.class.getResource("test1.png"));
        jf.add(new JLabel(cube),BorderLayout.EAST);


//        jf.setSize(600,400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.pack();
    }
}
