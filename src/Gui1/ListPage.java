package Gui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Gui1.Main.count;
import static Gui1.Main.students;

public class ListPage extends Container {
    private JTextArea textArea;
    private JButton refreshb,backb;

    public ListPage() {
        setSize(1000,1000);
        textArea=new JTextArea();
        textArea.setBounds(500,400,200,400);
        add(textArea);

        refreshb=new JButton("REFRESH");
        refreshb.setBounds(125,232,100,50);
        add(refreshb);
        refreshb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str="";
                for (int i = 0; i <count ; i++) {
                    str+=students[i].toString();
                }
                textArea.setText(str);

            }
        });



        backb = new JButton("Back");
        backb.setLocation(100,250);
        backb.setSize(300,30);
        add(backb);
        backb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.bf.listPage.setVisible(false);
                Main.bf.menuPage.setVisible(true);
            }
        });
    }
}
