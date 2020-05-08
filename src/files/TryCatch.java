package files;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        //BufferedReader - schityvaete s faila
        //BufferedWriter - zapisat v fail

        Scanner in = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("src//files//madina.txt"));
            String s = "";
            while((s = br.readLine()) != null){
                System.out.println(s);
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("src//files//madina.txt"));
////            String s = in.nextLine();
////            bw.write(s);
//
//            String s = "";
//            while(true){
//                s = in.nextLine();
//                if(s.equals("exit"))
//                    break;
//
//                bw.write(s + "\n");
//            }
//
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //InputMismatchException extends Exception
        //ArithmeticException extends Exception

//        int a, b;
//
//            try {
//                a = in.nextInt();
//                b = in.nextInt();
//            }
//            catch(Exception e){
//                System.out.println("ewe raz vvedi: ");
//                a = 0;
//                b = 0;
//            }
//
//        System.out.println("a+b="+(a+b));
//        System.out.println("Bye bye");






//        Student arr[] = new Student[100];
//        for(int i=0; i<5; i++){
//            arr[i] = new Student();
//        }
//        for(int i=0; i<5; i++){
//            System.out.println(arr[i]);
//        }

//        ArrayList<Student> list = new ArrayList<>();
//
//        list.add(new Student("Aza", "Tolegenov"));
//        list.add(new Student("Galiya", "Girmanova"));
//
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i)); //arr[0]
//        }

    }
}
