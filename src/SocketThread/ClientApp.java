//package SocketThread;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//
//public class ClientApp {
//    public static void main(String[] args) {
//        try {
//            Socket s=new Socket("localhost",1999);
//            ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
//            ObjectInputStream inp=new ObjectInputStream(s.getInputStream());
//
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
