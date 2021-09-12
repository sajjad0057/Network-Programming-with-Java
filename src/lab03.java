import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab03 {

    int amount;
    JTextField cb1,cb2,cb3;
    JLabel l;
    JButton b;
    JFrame jFrame;

    int x=100,y=100;
    public lab03() {
        jFrame=new JFrame("Title");
        jFrame.setLayout(null);
        l=new JLabel("asdf");
        l.setBounds(50,50,300,20);
        cb1=new JTextField();
        cb1.setBounds(x,y,150,20);
        cb2=new JTextField();
        cb2.setBounds(x,y+=50,150,20);
        cb3=new JTextField();
        cb3.setBounds(100,200,150,20);
        b=new JButton("Order");
        b.setBounds(100,250,80,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s="";
                amount=0;

                if(actionEvent.getSource()==b)
                {
                    s+="-------\n";
                    s+="amount: "+amount;
                    JOptionPane.showConfirmDialog(jFrame,s);
                }
            }
        });

        jFrame.add(l);
        jFrame.add(cb1);
        jFrame.add(cb2);
        jFrame.add(cb3);
        jFrame.add(b);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        jFrame.setSize(600,600);
    }

    public static void main(String[] args) {
        new lab03();
    }


}
