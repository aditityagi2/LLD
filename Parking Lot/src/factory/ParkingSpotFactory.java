package factory;

import entities.parking_spot.ParkingSpot;
import entities.parking_spot.TwoWheelerParkingSlot;
import entities.vehicles.Vehicle;
import entities.vehicles.VehicleType;

import static constants.ParkingExceptionConstants.INVALID_VEHICLE_TYPE;

public class ParkingSpotFactory {

    public ParkingSpot getParkingSpot(VehicleType vehicleType){
        return switch (vehicleType){
            case TWO_WHEELER -> new TwoWheelerParkingSlot();
            default -> throw new IllegalArgumentException(INVALID_VEHICLE_TYPE);
        };
    }
}
