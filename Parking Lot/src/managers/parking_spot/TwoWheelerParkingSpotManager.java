package managers.parking_spot;

import entities.parking_spot.ParkingSpot;
import entities.vehicles.Vehicle;
import entities.vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager {

    private List<ParkingSpot> parkingSpots;

    public TwoWheelerParkingSpotManager(){
        this.parkingSpots = new ArrayList<>();
    }

    @Override
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        return parkingSpots.stream().filter(parkingSpot -> parkingSpot.getParkingSpotType() == VehicleType.TWO_WHEELER)
                .filter(parkingSpot -> parkingSpot.isAvailable())
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean addParkingSpot(ParkingSpot parkingSpot) {
        if(parkingSpot!= null && parkingSpot.getParkingSpotType().equals(VehicleType.TWO_WHEELER)){
            parkingSpots.add(parkingSpot);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeParkingSpot(ParkingSpot parkingSpot) {
        if(parkingSpot !=null && parkingSpot.getParkingSpotType() == VehicleType.TWO_WHEELER){
            parkingSpots.remove(parkingSpot);
            return true;
        }
        return false;
    }

    @Override
    public ParkingSpot getParkingSpot(String licensePlate) {
        for(ParkingSpot parkingSpot : parkingSpots){
            Vehicle parkedVehicle = parkingSpot.getParkedVehicle();
            if(parkedVehicle!= null && parkedVehicle.getLicensePlate().equals(licensePlate) ){
                return parkingSpot;
            }
        }
        return null;
    }
}
