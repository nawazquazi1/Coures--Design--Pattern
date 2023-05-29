package src.com.java.course;

public class Car extends Vehicle{
    public Car(Workshop manufactureLine, Workshop assemblyLine) {
        super(manufactureLine, assemblyLine);
    }

    @Override
    public void manufacture() {
        System.out.println("Car...");
        manufactureLine.make();
        assemblyLine.make();
    }
}
