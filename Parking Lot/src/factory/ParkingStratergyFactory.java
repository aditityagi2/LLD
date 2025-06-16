package factory;

import constants.ParkingConstants;
import entities.parking_spot.ParkingSpot;
import utility.parking_stratergy.DefaultParkingStratergy;
import utility.parking_stratergy.ParkingStratergy;

import static constants.ParkingExceptionConstants.UNKOWN_PARKING_TYPE;

public class ParkingStratergyFactory {

    public ParkingStratergy createParkingStrategy(String strategyType){
       return switch (strategyType){
           case ParkingConstants.DEFAULT_PARKING_STRATERGY -> new DefaultParkingStratergy();
           default -> throw new IllegalArgumentException(UNKOWN_PARKING_TYPE + strategyType);
        };
    }
}
