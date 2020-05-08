package Socket2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

//КЛИЕНТ
public class ClientApp {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1999);

            System.out.println("Client side");

            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

            Scanner in = new Scanner(System.in);
            int ID = 1;

            while(true){
                System.out.println("1. add");
                System.out.println("2. list");
                System.out.println("3. remove");
                System.out.println("4. exit");

                int choice = in.nextInt();
                in.nextLine();

                if(choice == 1){
                    System.out.print("name: ");
                    String name = in.nextLine();
                    System.out.print("author: ");
                    String author = in.nextLine();

                    Book b = new Book(ID++, name, author);

                    Packet packet = new Packet(b, "ADD");
                    oos.writeObject(packet);
                }
                if(choice == 2){
                    Packet packet = new Packet("LIST");
                    oos.writeObject(packet);

                    Packet packet2 = (Packet)ois.readObject();
                    ArrayList<Book> books = packet2.getBooks();

                    for(Book b : books){
                        System.out.println(b);
                    }
                }
                if(choice == 3){
                    Packet packet = new Packet("LIST");
                    oos.writeObject(packet);

                    Packet packet2 = (Packet)ois.readObject();
                    ArrayList<Book> books = packet2.getBooks();

                    for(Book b : books){
                        System.out.println(b);
                    }

                    System.out.print("ID to remove: ");
                    int id = in.nextInt();

                    Packet packet3 = new Packet(id, "REMOVE");
                    oos.writeObject(packet3);
                }
                if(choice == 4){
                    oos.writeObject(new Packet("EXIT"));
                    break;
                }
            }

            ois.close();
            oos.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
