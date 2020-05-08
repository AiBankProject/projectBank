package Socket2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerApp {
    public static void main(String[] args) {

        //prikinem chto eta baza dannyh
        ArrayList<Book> books = new ArrayList<>();

        try {
            ServerSocket ss = new ServerSocket(1999);

            System.out.println("server started, but no clients connected");
            Socket s = ss.accept();//accept - srabotaet togda kogda KLIENT soedinitsya s serverom

            System.out.println("client connected");

            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

            while(true){
                Packet packet = (Packet)ois.readObject();

                if(packet.getCode().equals("ADD")){
                    books.add(packet.getBook());
                }
                if(packet.getCode().equals("LIST")){
                    oos.writeObject(new Packet(books));
                }
                if(packet.getCode().equals("REMOVE")){
                    int index = -1;

                    for(int i = 0; i<books.size(); i++){
                        if(books.get(i).getId() == packet.getBookid()){
                            index = i;
                            break;
                        }
                    }

                    if(index != -1){
                        books.remove(index);
                    }
                }
                if(packet.getCode().equals("EXIT")){
                    System.out.println("SERVER STOPPED");
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
