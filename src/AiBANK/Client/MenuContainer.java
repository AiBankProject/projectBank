package AiBANK.Client;

import AiBANK.Client.Template.MyButton;
import AiBANK.dataB.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MenuContainer extends Container {
    private MyButton mybankB, transB,exitB,credB,depoB;
    private  BossFrame frame=null;

    public MenuContainer(BossFrame frame){
        this.frame=frame;
        setSize(800, 600);
        setBackground(Color.white);

        mybankB = new MyButton("My Bank",100,80);
        add(mybankB);
        mybankB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuPage.setVisible(false);
                frame.myBank.setVisible(true);


            }
        });


        transB = new MyButton("Transfer",100,150);
        add(transB);
        transB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuPage.setVisible(false);
                frame.transferPage.setVisible(true);
            }
        });


        credB = new MyButton("Credit",100,220);
        add(credB);
        credB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuPage.setVisible(false);
                frame.creditPage.setVisible(true);
            }
        });


        depoB = new MyButton("Deposit",100,300);
        add(depoB);
        depoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuPage.setVisible(false);
                frame.depozitPage.setVisible(true);
            }
        });


        exitB = new MyButton("Log out",200,400);
        add(exitB);
        exitB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });










    }





}