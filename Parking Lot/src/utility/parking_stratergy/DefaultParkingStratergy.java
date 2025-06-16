package utility.parking_stratergy;

import constants.ParkingExceptionConstants;
import exceptions.ParkingSpotException;
import managers.parking_spot.ParkingSpotManager;
import entities.parking_spot.ParkingSpot;
import entities.vehicles.Vehicle;

public class DefaultParkingStratergy implements ParkingStratergy {


    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {
       ParkingSpot allocatedParkingSpot =  parkingSpotManager.findParkingSpot(vehicle) ;
       if(allocatedParkingSpot == null){
            throw new ParkingSpotException(ParkingExceptionConstants.No_EMPTY_SLOT);
       }
       return allocatedParkingSpot;
    }
}
