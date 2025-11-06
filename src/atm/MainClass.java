package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6;
    String pin;

    MainClass(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,800);
        add(l3);

        JLabel label = new JLabel("Please select your transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("MINI STATEMENT");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(700,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("PIN CHANGE");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(410,362,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("BALANCE INQUIRY");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(700,362,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("EXIT");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,406,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()== b6){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdraw(pin);
            setVisible(false);
        } else if (e.getSource()== b5) {
            new BalanceInquiry(pin);
            setVisible(false);
        } else if (e.getSource()== b4) {
            new ChangePIN(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new MiniStatement(pin);
        }
    }
    public static void main(String[] args) {
        new MainClass("");
    }
}
