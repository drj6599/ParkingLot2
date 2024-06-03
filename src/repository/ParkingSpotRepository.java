package repository;

import exception.ParkingSpotNotFoundException;
import model.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<Integer,ParkingSpot>();
    }

    public ParkingSpot getTicket(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("Parking Spot is not present in the database");
        }
        return parkingSpot;
    }

    public void addTicket(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking Spot added to the database successfully");
    }
}
