package socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(1999);
            System.out.println(" Server podklywilsa no client ne soedinilsa");
            Socket  s=ss.accept();
            System.out.println("client connected");

            ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            String strKelC=" ";
            while (true){
                strKelC=(String)in.readObject();
                if(strKelC.equals("exit"))
                    break;

                if(strKelC.equals("hello") || strKelC.equals("hi"))
                out.writeObject("how are you");

                 else
                     if(strKelC.equals("ok"))
                out.writeObject("i am ko, to you");

                else
                    out.writeObject("i dony understand you");







            }

//            String strKel=(String)in.readObject();
//
//            System.out.println("klient jibergen sobwenie "+strKel );
//
//
//            //Sobw kabyldagannan kein obratno clientke jauap beremiz
//
//            out.writeObject("by by");




            out.close();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
