package service;

import model.Gate;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("****** Starting Initialisation ******");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(777);
        parkingLot.setName("Dheeraj Parking Center");
        parkingLot.setAddress("Phoenix Mall,wakad,Pune");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypes(List.of(VehicleType.TWO_WHEELER,VehicleType.FOUR_WHEELER,VehicleType.EV_CAR,VehicleType.LUXURY_CAR));

        List<ParkingFloor> floors = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i * 100)+ j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                if(j<2) parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                if(j<5) parkingSpot.setVehicleType(VehicleType.TWO_WHEELER);
                if(j<8) parkingSpot.setVehicleType(VehicleType.EV_CAR);
                parkingSpot.setVehicleType(VehicleType.LUXURY_CAR);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.add(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.add(entryGate);

            //creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " + i + 2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.add(exitGate);

            floors.add(parkingFloor);
            parkingFloorRepository.add(parkingFloor);
        }
        parkingLot.setParkingFloors(floors);
        parkingLotRepository.add(parkingLot);
        return parkingLotRepository.getParkingLot(777);
    }
}
