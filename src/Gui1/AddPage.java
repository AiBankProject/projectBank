package Gui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends Container {
    private JButton backButton, addButton;
    private JLabel namel, surnamel, facl, groupl;
    private JTextField namet, surnamet, groupt;
    private String faculties[] = {"", "CSSE", "LANGUAGES", "ECONOMICS"};
    private JComboBox facBox;

    public AddPage(){
        setSize(800,600);

        namel = new JLabel("NAME: ");
        namel.setBounds(100, 50, 100, 30);
        surnamel = new JLabel("SURNAME: ");
        surnamel.setBounds(80, 100, 100, 30);
        facl = new JLabel("FACULTY: ");
        facl.setBounds(80, 150, 100, 30);
        groupl = new JLabel("GROUP: ");
        groupl.setBounds(95, 200, 100, 30);

        namet = new JTextField();
        namet.setBounds(250, 50, 100, 30);
        surnamet = new JTextField();
        surnamet.setBounds(250, 100, 100, 30);
        facBox = new JComboBox(faculties);
        facBox.setBounds(250, 150, 100, 30);
        groupt = new JTextField();
        groupt.setBounds(250, 200, 100, 30);

        backButton = new JButton("Back");
        backButton.setLocation(100,250);
        backButton.setSize(300,30);
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               Main.bf.addPage.setVisible(false);
               Main.bf.menuPage.setVisible(true);
            }
        });

        addButton = new JButton("Add");
        addButton.setLocation(100,300);
        addButton.setSize(300,30);
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Student st = new Student();
                st.setName(namet.getText());
                st.setSurname(surnamet.getText());
                st.setGroup(groupt.getText());
                st.setFaculty(facBox.getSelectedItem().toString());

                if (facBox.getSelectedIndex() != 0) {
                    Main.addStuds(st);

                    namet.setText("");
                    surnamet.setText("");
                    groupt.setText("");
                    facBox.setSelectedIndex(0);
                }
            }
            });

        add(namel);
        add(namet);
        add(surnamel);
        add(surnamet);
        add(facl);
        add(facBox);
        add(groupl);
        add(groupt);
        add(backButton);
        add(addButton);
    }
}
