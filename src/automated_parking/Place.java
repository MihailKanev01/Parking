package automated_parking;

public class Place extends  Premises{
    private Vehicle vehicle;

    public Place(double width, double length) {
        super(width, length);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void release(){

    }

    public boolean isFree(){
        return true;
    }
}
