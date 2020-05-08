package Gui1;
public class Main {
    public  static BossFrame bf;
    public  static  Student students[]=new Student[100];
    public  static int count;
    public  static  void addStuds(Student s){
        students[count++]=s;
    }

    public static void main(String[] args) {
        bf=new BossFrame();
    }
}
