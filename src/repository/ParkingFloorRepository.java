package repository;

import exception.ParkingFloorNotFoundException;
import model.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<Integer,ParkingFloor>();
    }

    public ParkingFloor getTicket(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("Parking Floor is not present in the database");
        }
        return parkingFloor;
    }

    public void addTicket(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking Floor added to the database successfully");
    }
}
