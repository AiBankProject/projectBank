package thread;

public class Car extends Thread{
    String model;
    int speed;
    static int number = 1;

    public Car(String m, int s){
        model = m;
        speed = s;
    }

    public void run(){
        int dist = 0;

        while(dist < 1000){
            System.out.println(model + " " + dist);
            dist += speed;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {e.printStackTrace();}
        }

        System.out.println("------ " + model + " finished: " + number);
        number++;
    }
}
