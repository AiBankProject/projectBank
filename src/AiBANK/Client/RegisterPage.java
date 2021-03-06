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

public class RegisterPage extends Container {
    private MyLabel nl, pl, ll;
    private MyTextField ntf, ltf;
    private MyPasswordField ptf;
    private MyButton regb;
    private BossFrame frame = null;

    public RegisterPage(BossFrame frame){
        this.frame = frame;

        setSize(800, 600);
        setBackground(Color.white);

        ll = new MyLabel("login: ", 50, 50);
        add(ll);
        pl = new MyLabel("password: ", 50, 100);
        add(pl);
        nl = new MyLabel("name: ", 50, 150);
        add(nl);
        ltf = new MyTextField(150, 50);
        add(ltf);
        ptf = new MyPasswordField(150, 100);
        add(ptf);
        ntf = new MyTextField(150, 150);
        add(ntf);
        regb = new MyButton("Register", 150, 200);
        add(regb);

        regb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ntf.getText().isEmpty() || ltf.getText().isEmpty() || ptf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fill all fields");
                }
                else{
                    User u = new User();
                    u.setLogin(ltf.getText());
                    u.setName(ntf.getText());
                    u.setPassword(ptf.getText());

                    boolean registered = frame.clientSocket.toRegister(u);
                    if(registered == true){
                        JOptionPane.showMessageDialog(frame, "You are registered");
                        ntf.setText("");
                        ltf.setText("");
                        ptf.setText("");

                        frame.regPage.setVisible(false);
                        frame.logPage.setVisible(true);
                    }
                }
            }
        });
    }
}
