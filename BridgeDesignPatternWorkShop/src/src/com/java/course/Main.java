package src.com.java.course;

public class Main {

    public static void main(String[] args) {
        Vehicle audi = new Car(new Make(),new Assemble());
        audi.manufacture();

        Vehicle vtt = new Bike(new Make(),new Assemble());
        vtt.manufacture();
    }
}
