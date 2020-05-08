package AiBANK.Client;

import AiBANK.Client.Template.MyButton;
import AiBANK.Client.Template.MyLabel;
import AiBANK.Client.Template.MyPasswordField;
import AiBANK.Client.Template.MyTextField;
import AiBANK.dataB.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends Container {
    private MyLabel ll, pl;
    private MyTextField ltf;
    private MyPasswordField ptf;
    private MyButton logb = null;
    private BossFrame frame = null;

    public LoginPage(BossFrame frame){
        this.frame = frame;

        setSize(800, 600);
        setBackground(Color.orange);
LoginPage l=new LoginPage();

        ll = new MyLabel("login: ", 50, 50);
        add(ll);

        pl = new MyLabel("password: ", 50, 100);
        add(pl);

        ltf = new MyTextField(150, 50);
        add(ltf);

        ptf = new MyPasswordField(150, 100);
        add(ptf);

        logb = new MyButton("Login", 150, 150);
        add(logb);

        logb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(ltf.getText().isEmpty() || ptf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fill all fields");
                }
                else{
                    User u = new User();
                    u.setLogin(ltf.getText());
                    u.setPassword(ptf.getText());

                    User authUser = frame.clientSocket.toLogin(u);
                    if(authUser != null){
                        JOptionPane.showMessageDialog(frame, "You are Logged in");
                        ltf.setText("");
                        ptf.setText("");
                        frame.logPage.setVisible(false);
                        frame.menuPage.setVisible(true);

                        if(authUser.getRole().equals("ADMIN")){
                            //go to AddBookPage
                        }
                        else{
                            //go to ListBookPage
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(frame, "Incorrect login or password");
                }
            }
        });
    }

    public LoginPage() {

    }


}
