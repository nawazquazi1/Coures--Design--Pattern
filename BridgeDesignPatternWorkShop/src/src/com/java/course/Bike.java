package src.com.java.course;

public class Bike extends Vehicle{
    public Bike(Workshop manufactureLine, Workshop assemblyLine) {
        super(manufactureLine, assemblyLine);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike...");
        manufactureLine.make();
        assemblyLine.make();
    }
}
