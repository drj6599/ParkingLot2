package repository;

import exception.VehicleNotFoundException;
import model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private Map<Integer, Vehicle> vehicleMap;

    public VehicleRepository() {
        this.vehicleMap = new HashMap<Integer,Vehicle>();
    }

    public Vehicle getTicket(int vehicleId){
        Vehicle vehicle = vehicleMap.get(vehicleId);
        if(vehicle == null){
            throw new VehicleNotFoundException("Vehicle is not present in the database");
        }
        return vehicle;
    }

    public void addTicket(Vehicle vehicle){
        vehicleMap.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle added to the database successfully");
    }
}
