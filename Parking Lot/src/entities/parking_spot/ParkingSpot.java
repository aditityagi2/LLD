package entities.parking_spot;

import entities.vehicles.Vehicle;
import entities.vehicles.VehicleType;

public interface ParkingSpot {
    boolean isAvailable();
    void parkVehicle(Vehicle vehicle);
    Vehicle removeVehicle();
    Vehicle getParkedVehicle();
    VehicleType getParkingSpotType();
}
