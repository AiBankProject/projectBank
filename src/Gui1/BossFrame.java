package Gui1;

import javax.swing.*;



public class BossFrame extends JFrame {
    public  static MenuPage menuPage;
    public  static AddPage addPage;
    public  static ListPage listPage;



    public BossFrame(){
        setTitle("Application");
        setSize(1000,1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        menuPage=new MenuPage();
        add(menuPage);

        addPage=new AddPage();
        add(addPage);
        addPage.setVisible(false);

        listPage=new ListPage();
        add(listPage);
        listPage.setVisible(false);

    }

}
