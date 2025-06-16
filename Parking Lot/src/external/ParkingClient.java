package external;

import factory.ParkingManagerFactory;
import managers.parking_spot.ParkingSpotManager;

import static entities.vehicles.VehicleType.TWO_WHEELER;

public class ParkingClient {
    public static void main(String args[]){
        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();

        try {
            ParkingSpotManager parkingSpotManager = new ParkingManagerFactory().getParkingSpotManager(TWO_WHEELER);

            for(int i =-0 ; i < 10 ; i++){
               // parkingSpotManager.addParkingSpot();
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
