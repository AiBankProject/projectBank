package files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Contact> list = null;
    private Scanner in = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public PhoneBook(){
        list = new ArrayList<>();
        in = new Scanner(System.in);

        try {
            br = new BufferedReader(new FileReader("src//files//contacts.txt"));

            String line = "";
            while((line = br.readLine()) != null){
                String arr[] = line.split(" ");
                int id = Integer.parseInt(arr[0]);

                list.add(new Contact(id, arr[1], arr[2]));
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        menu();
    }

    public void menu(){
        while(true){
            System.out.println("1 add contact");
            System.out.println("2 list all contacts");
            System.out.println("3 remove contact");
            System.out.println("4 exit");

            int choice = in.nextInt();

            if(choice == 4){
                try {
                    bw = new BufferedWriter(new FileWriter("src//files//contacts.txt"));
                    for(Contact c : list) {
                        bw.write(c.toString() + "\n");
                    }
                    bw.close();
                }
                catch (IOException e) { e.printStackTrace(); }
                break;
            }
            if(choice == 1){
                System.out.print("name: ");
                String n = in.next();
                System.out.print("phone: ");
                String ph = in.next();

                int ID = 1;

                if(!list.isEmpty()){
                    ID = list.get(list.size()-1).getId()+1;
                }

                list.add(new Contact(ID, n, ph));
            }
            if(choice == 2){
                for(int i=0; i<list.size(); i++){
                    System.out.println(list.get(i));
                }
//                for(Contact c : list){
//                    System.out.println(c);
//                }
            }
            if(choice == 3){
                System.out.println("----------------");
                for(int i=0; i<list.size(); i++){
                    System.out.println(list.get(i));
                }
                System.out.println("----------------");

                System.out.print("vvedi ID dlya udaleniya: ");
                int deleteID = in.nextInt();

                for(Contact c : list){
                    if(c.getId() == deleteID){
                        list.remove(c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

//        String s = "1 Azamat 88888888";
//        String arr[] = s.split(" ");
        //arr => ["1"]["Azamat"]["8888888"]
//
//        System.out.println("arr[0] = "+arr[0]);
//        System.out.println("arr[1] = "+arr[1]);
//        System.out.println("arr[2] = "+arr[2]);
//        int id = Integer.parseInt(arr[0]);

    }
}
