package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JButton exitb;
    private JLabel label;
    private JTextField textField;

    public  MyFrame(){
        setSize(1920,1080);
        setTitle("Glavniy");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        exitb=new JButton("exit");
        exitb.setBounds(1880,1000,100,30);
        add(exitb);

        textField=new JTextField();
        textField.setBounds(50,50,50,30);
        add(textField);

        label=new JLabel("name");
        label.setBounds(0,50,40,30);
        add(label);

        exitb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             label.setText(textField.getText());
            }
        });
    }


}
