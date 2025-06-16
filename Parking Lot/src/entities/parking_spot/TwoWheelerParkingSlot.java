package entities.parking_spot;

import entities.vehicles.Vehicle;
import entities.vehicles.VehicleType;

public class TwoWheelerParkingSlot implements ParkingSpot {

    private boolean isAvailable;
    private Vehicle parkedVehicle;


    public TwoWheelerParkingSlot() {
        this.isAvailable = true ;
        this.parkedVehicle = null;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
    this.isAvailable = false;
    this.parkedVehicle = vehicle;

    }

    @Override
    public Vehicle removeVehicle() {
      if(!isAvailable){
          isAvailable = true;
          Vehicle removedVehicle = parkedVehicle;
          parkedVehicle = null;
          return removedVehicle;
      }
       return null ;
    }

    @Override
    public Vehicle getParkedVehicle() {
        return parkedVehicle;

    }

    @Override
    public VehicleType getParkingSpotType() {
        return VehicleType.TWO_WHEELER;
    }
}
