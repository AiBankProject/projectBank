package AiBANK.Client;

import AiBANK.Client.Template.MyButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepozitPage extends Container {
    private MyButton backB;
    private  BossFrame frame=null;
    public DepozitPage(BossFrame frame){
        this.frame=frame;
        setSize(800,600);


        backB=new MyButton("back",200,400);
        add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.depozitPage.setVisible(false);
                frame.menuPage.setVisible(true);

            }
        });
    }
}