package AiBANK.Client;

import AiBANK.Client.Template.MyButton;
import AiBANK.Client.Template.MyLabel;
import AiBANK.Client.Template.MyTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferPage extends Container {

    private MyButton transfB,backB;
    private MyLabel  toL,howL;
    private MyTextField toT,howT;
    private  BossFrame frame=null;

    public TransferPage(BossFrame frame){
        this.frame=frame;
        setSize(800,600);

        toL=new MyLabel("To whom?",100,200);
        add(toL);
        toT=new MyTextField(300,200);
        add(toT);


        howL=new MyLabel("How many?",100,250);
        add(howL);
        howT=new MyTextField(300,250);
        add(howT);

        transfB=new MyButton("translate",300,300);
        add(transfB);

        backB=new MyButton("back",200,400);
        add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.transferPage.setVisible(false);
                frame.menuPage.setVisible(true);

            }
        });








    }
}