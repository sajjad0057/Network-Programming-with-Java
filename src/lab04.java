import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class lab04 implements ActionListener {
    //    String s="+12+12-4";
    String ops="+-*/";
    String chars="0123456789";
    String formatter="=c";
    int amount=0;
    JTextField jTextField;
    public lab04() {

        JFrame jFrame=new JFrame("Calculator");
        jTextField=new JTextField();
        jFrame.add(jTextField, BorderLayout.NORTH);
        JPanel jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(4,4));
        jFrame.add(jPanel);

        for (char c:new String(chars+ops+formatter).toCharArray())
        {
            JButton jButton=new JButton(String.valueOf(c));
            jPanel.add(jButton);
            jButton.addActionListener(this);
        }

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.pack();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(Objects.equals(actionEvent.getActionCommand(), "="))
        {
            amount=0;
            calculate("+"+jTextField.getText());
            jTextField.setText(String.valueOf(amount));
        }else if(Objects.equals(actionEvent.getActionCommand(), "c"))
        {
            jTextField.setText("");
        }else {
            jTextField.setText(jTextField.getText()+actionEvent.getActionCommand());
        }
    }

    public void calculate(String s) {
        for (int i=0;i<s.length();)
        {
            if(checkops(s.charAt(i)))
            {
                for (int j=i+1;j<=s.length();j++)
                {
                    if(j>=s.length() || checkops(s.charAt(j)))
                    {
                        char op=s.charAt(i);
                        String temp=s.substring(i+1,j);
                        operation(temp,op);
                        i=j;
                    }
                }
            }else {
                i++;
            }
        }

    }
    boolean checkops(char c)
    {
        for (char t:ops.toCharArray())
        {
            if(t==c)
                return true;
        }
        return false;
    }

    void operation(String sn,char op)
    {
        int number=Integer.valueOf(sn);
        switch (op){
            case '+':
                amount+=number;
                break;
            case '-':
                amount-=number;
                break;
            case '*':
                amount*=number;
                break;
            case '/':
                amount/=number;
                break;
        }
    }



    public static void main(String[] args) {
        new lab04();
    }


}