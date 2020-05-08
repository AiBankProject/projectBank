package AiBANK.Client;

import AiBANK.Client.Template.MyButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditPage  extends Container {
    private MyButton next,help,backB;

    private  BossFrame frame=null;
    public CreditPage(BossFrame frame){
        this.frame=frame;
        setSize(800,600);


        next=new MyButton("Continue",100,170);
        add(next);

        help=new MyButton("Help",100,250);
        add(help);

        backB=new MyButton("back",200,400);
        add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.creditPage.setVisible(false);
                frame.menuPage.setVisible(true);

            }
        });


    }
}