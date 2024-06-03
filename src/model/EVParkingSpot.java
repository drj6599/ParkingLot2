package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

public class EVParkingSpot extends ParkingSpot{
    private String charger;

    public EVParkingSpot(String charger) {
        this.charger = charger;
    }

    public EVParkingSpot(int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle, String charger) {
        super(number, vehicleType, parkingSpotStatus, vehicle);
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }
}
