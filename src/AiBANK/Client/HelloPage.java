package AiBANK.Client;

import AiBANK.Client.BossFrame;
import AiBANK.Client.Template.MyButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloPage extends Container {
    private MyButton logB,regB;
    private BossFrame frame = null;
    public HelloPage(BossFrame frame) {
        this.frame=frame;
        setSize(800,600);

        logB=new MyButton("Log in",350,200);
        add(logB);
        regB=new MyButton("Register",350,250);
        add(regB);


        logB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.helloPage.setVisible(false);
                frame.logPage.setVisible(true);
            }
        });

        regB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.helloPage.setVisible(false);
                frame.regPage.setVisible(true);
            }
        });
    }

}
