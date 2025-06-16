package factory;

import entities.vehicles.VehicleType;
import utility.payment_stratergy.FeeStratergy;
import utility.payment_stratergy.TwoWheelerFeeStartergy;

import static constants.ParkingExceptionConstants.INVALID_VEHICLE_TYPE;
import static entities.vehicles.VehicleType.TWO_WHEELER;


public class FeeStartegyFactory {
    public FeeStratergy getFeeStartergy(VehicleType vehicleType){
        return switch(vehicleType){
            case TWO_WHEELER -> new TwoWheelerFeeStartergy();
            default -> throw new IllegalArgumentException(INVALID_VEHICLE_TYPE + vehicleType);
        };
    }
}
