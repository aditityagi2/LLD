package utility.parking_stratergy;

import managers.parking_spot.ParkingSpotManager;
import entities.parking_spot.ParkingSpot;
import entities.vehicles.Vehicle;

public interface ParkingStratergy {
    ParkingSpot allocateSpot(Vehicle vehicle , ParkingSpotManager parkingSpotManager);

}
