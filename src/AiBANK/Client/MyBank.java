package AiBANK.Client;

import AiBANK.Client.Template.MyButton;
import AiBANK.Client.Template.MyLabel;
import AiBANK.Client.Template.MyTextField;
import AiBANK.dataB.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBank extends Container {
    private MyButton historyB,backB;
    private MyLabel availableL,numberCardL;
    private MyTextField availableT,numberCartT;


    private  BossFrame frame=null;
    public MyBank(BossFrame frame){
        this.frame=frame;
        setSize(800, 600);


        backB=new MyButton("back",200,400);
        add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.myBank.setVisible(false);
                frame.menuPage.setVisible(true);

            }
        });

        historyB=new MyButton("history",200,300);
        add(historyB);



        availableL=new MyLabel("balance:",100,200);
        add(availableL);

        numberCardL=new MyLabel("Number Card",100,250);
        add(numberCardL);

        availableT=new MyTextField(200,200);
        add(availableT);

        numberCartT=new MyTextField(200,250);
        add(numberCartT);





        historyB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.myBank.setVisible(false);
                frame.historyPage.setVisible(true);




            }
        });
    }




}
