
import controller.InitController;
import model.ParkingLot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import service.InitialisationService;

import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();

        InitialisationService initialisationService = new InitialisationService(
                gateRepository,
                parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository
        );

        InitController initController = new InitController(initialisationService);
        System.out.println("***PARKING LOT DATA INITIALISATION - START");
        ParkingLot parkingLot = initController.init();
        System.out.println("***PARKING LOT DATA INITIALISATION - END");
        
    }
}