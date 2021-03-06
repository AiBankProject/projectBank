package AiBANK.Client.Template;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class MyPasswordField extends JPasswordField {
    public MyPasswordField(int x, int y){
        setForeground(Color.darkGray);
        setBackground(Color.white);
        setSize(200, 30);
        setLocation(x, y);
        setFont(new Font("Arial", Font.BOLD, 16));
        setBorder(new EtchedBorder(Color.GRAY, Color.GRAY));
    }
}
