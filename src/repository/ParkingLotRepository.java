package repository;

import exception.ParkingLotNotFoundException;
import model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<Integer,ParkingLot>();
    }

    public ParkingLot getParkingLot(int parkingLotId){
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("Parking Lot is not present in the database");
        }
        return parkingLot;
    }

    public void add(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking Lot added to the database successfully");
    }
}
