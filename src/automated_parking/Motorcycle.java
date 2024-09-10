package automated_parking;

public class Motorcycle extends Vehicle {
    public Motorcycle(double width, double length, Engine engine) {
        super(width, length, engine);
    }

    @Override
    public String klaxon() {
        return "";
    }
}
