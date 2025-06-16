package managers.parking_spot;

import entities.parking_spot.ParkingSpot;
import entities.vehicles.Vehicle;

public interface ParkingSpotManager {
    ParkingSpot findParkingSpot(Vehicle vehicle);
    boolean addParkingSpot(ParkingSpot parkingSpot);
    boolean removeParkingSpot(ParkingSpot parkingSpot);
    ParkingSpot getParkingSpot(String licensePlate);


}
