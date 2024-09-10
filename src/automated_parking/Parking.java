package automated_parking;

import java.util.ArrayList;

public class Parking extends Premises{
    private ArrayList<Place> places;

    public Parking(double width, double length, int placeCount) {
        super(width, length);
        places = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle){
        return true;
    }

    public boolean release(int position){
        return true;
    }
}
