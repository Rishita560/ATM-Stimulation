package atm;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    String pin;
    TextField textField;
    JButton b1, b2;

    Deposit(String pin){
        this.pin = pin;

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        add(label1);

        textField = new TextField();
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Deposit("4875");
    }
}
