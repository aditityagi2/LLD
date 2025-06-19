package factory;

import entities.vehicles.VehicleType;
import managers.parking_spot.ParkingSpotManager;
import managers.parking_spot.TwoWheelerParkingSpotManager;

import static constants.ParkingExceptionConstants.INVALID_VEHICLE_TYPE;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) throws IllegalAccessException {
        return switch (vehicleType){
            case TWO_WHEELER -> new TwoWheelerParkingSpotManager();
            default -> throw new IllegalAccessException(INVALID_VEHICLE_TYPE);
        };
    }
}
