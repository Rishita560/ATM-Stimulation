package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame  implements ActionListener {

    String pin;

    JLabel label2;

    JButton b1;

    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(name:"icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(l3);


        JLabel label1 = new JLabel(text:"Your Current Balance Is Rs");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font(name:"System", Font.BOLD, size:16));
        label1.setBounds(430,180,700,35);
        l3.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font(name:"System", Font.BOLD, size:16));
        label2.setBounds(430,180,700,35);
        l3.add(label2);


        b1 =new JButton(text:"BLACK");
        b1.setBounds(700,406,150,35)
        b1.setBackground(new Color(r:65,g:125,b:128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0;
        try{
            Con c = new Con();
            ResultSet resultSet =c.statement.executeQuery(sql:"Select * from bank where pin = '"+pin+"'");
            while(reaultSet.next()){
                if(resultSet.getString(columnLabel:"type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString(columnLabel:"amount"));

                }else{
                    balance -= Integer.parseInt(resultSet.getString(columnLabel:"amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @overide
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args){
        new BalanceEnquiry(pin:"");
    }
}package bank.management.system;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame  implements ActionListener {

    String pin;

    JLabel label2;

    JButton b1;

    BalanceEnquiry(String pin){
        this.pin = pin;


