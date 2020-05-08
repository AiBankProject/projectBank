package Gui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends Container {
    private JButton addb,listb,exitb;

    public MenuPage() {
        setSize(1000,1000);

        addb=new JButton("ADD");
        addb.setBounds(200,100,100,50);
        add(addb);
        addb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.bf.menuPage.setVisible(false);
                Main.bf.addPage.setVisible(true);


            }
        });

        listb=new JButton("LIST");
        listb.setBounds(200,200,100,50);
        add(listb);
        listb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.bf.menuPage.setVisible(false);
                Main.bf.listPage.setVisible(true);


            }
        });

        exitb=new JButton("EXIT");
        exitb.setBounds(200,300,100,50);
        add(exitb);
        exitb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
