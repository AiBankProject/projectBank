package thread;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("merc", 90);
        Car c2 = new Car("toyota", 60);
        Car c3 = new Car("traktor", 40);

        c1.start();
        c2.start();
        c3.start();


    }
}
