package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

public class LuxuryParkingSpot extends ParkingSpot{
    private String guard;

    public LuxuryParkingSpot(String guard) {
        this.guard = guard;
    }

    public LuxuryParkingSpot(int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle, String guard) {
        super(number, vehicleType, parkingSpotStatus, vehicle);
        this.guard = guard;
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }
}
