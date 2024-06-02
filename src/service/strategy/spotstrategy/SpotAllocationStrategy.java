package service.strategy.spotstrategy;

import model.ParkingSpot;
import model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
