package automated_parking;

public abstract class Vehicle implements  Charging, Volume{
    private Dimensions dimensions;
    private Engine engine;

    public Vehicle(double width, double length, Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract String klaxon();

    @Override
    public String onCharging() {
        return "";
    }

    @Override
    public double calculate() {
        return 0;
    }
}
