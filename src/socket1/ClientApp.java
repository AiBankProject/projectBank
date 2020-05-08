package socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp{
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        try {
            Socket s=new Socket("localhost",1999);

            ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            String str=" ";
            while (true){
                System.out.println("mesage to server: ");
                str=sin.nextLine();

                out.writeObject(str);



                if (str.equals("exit"))
                    break;


                str=(String)in.readObject();
                System.out.println("message from  server: "+str);







            }


            out.close();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
