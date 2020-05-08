package Serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            ObjectInputStream oqu=new ObjectInputStream(new FileInputStream("src//Serialize//ser.txt"));
//            try {
//                Book book=(Book) oqu.readObject();
//                oqu.close();
//                System.out.println(book);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Book b=new Book("java",8788,888);
//
//        try {
//            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src//serialize//ser.txt"));
//            out.writeObject(b);  ///осы оюбъектті ser.txt ға жазу  байт түрінде
//            out.close();  // обезательно жазып болғаннан кейін жабу керек
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

        try {
            ObjectInputStream inp=new ObjectInputStream(new FileInputStream("src//Serialize//ser.txt"));
            try {
                Book book=(Book) inp.readObject();
                inp.close();
                System.out.println(book);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//     Book book=new Book("gfdgfd",6556,47)   ;
//
//        try {
//            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src//Serialize//ser.txt"));
//            out.writeObject(book);
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

    }
}
