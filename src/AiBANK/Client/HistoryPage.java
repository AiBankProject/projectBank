package AiBANK.Client;

import AiBANK.Client.Template.MyButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoryPage extends Container {
    private  BossFrame frame=null;
    private MyButton backB;

    public  HistoryPage(BossFrame frame){
        this.frame=frame;
        setSize(800,600);

        backB=new MyButton("back",200,400);
        add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.historyPage.setVisible(false);
                frame.myBank.setVisible(true);

            }
        });
    }
}