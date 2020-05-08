package Serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private String name;
    private ArrayList<Good> goods = null;
    private Scanner in = new Scanner(System.in);

    public Shop(){
        readFromFile();
    }
    public Shop(String name) {
        this.name = name;
        readFromFile();
    }

    private void readFromFile(){
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream("src//serialize//myshop.txt"));
            goods = (ArrayList<Good>)oin.readObject();
            oin.close();
        } catch (IOException e) {
            System.out.println("file is empty");
            goods = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void menu(){
        while(true){
            System.out.println("1. add good");
            System.out.println("2. remove good");
            System.out.println("3. see all goods");
            System.out.println("4. exit");

            int choice = in.nextInt();

            if(choice == 4){
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src//serialize//myshop.txt"));
                    out.writeObject(goods);
                    out.close();
                }
                catch(IOException e){e.printStackTrace();}

                break;
            }
            if(choice == 1){
                Good g = new Good();
                System.out.print("name: ");
                g.setName(in.next());
                System.out.print("price: ");
                g.setPrice(in.nextInt());

                goods.add(g);
            }
            if(choice == 2){
                listGoods();
                System.out.print("choose number to remove: ");
                int num = in.nextInt();

                goods.remove(num);
            }
            if(choice == 3){
                listGoods();
            }
        }
    }

    private void listGoods(){
        for(int i=0; i<goods.size(); i++){
            System.out.println(i + ") " + goods.get(i));
        }
    }

//    public void addGood(Good g){
//        goods.add(g);
//    }
//    public void remove(Good g){
//        goods.remove(g);
//    }
//    public Good get(int index){
//        return goods.get(index);
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", goods=" + goods;
    }
}
