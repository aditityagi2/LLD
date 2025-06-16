package utility.payment_stratergy;

import entities.vehicles.VehicleType;

import static constants.ParkingExceptionConstants.INVALID_VEHICLE_TYPE;
import static constants.ParkingExceptionConstants.NOT_TWO_WHEELER;
import static entities.vehicles.VehicleType.TWO_WHEELER;

public class TwoWheelerFeeStartergy implements FeeStratergy {

    private static final double BASE_FEE = 10.0; // Base fee for two-wheelers
    private static final double PER_HOUR_FEE = 5.0; // Fee per hour

    @Override
    public double getFee(VehicleType vehicleType, double duration) {
        if (vehicleType != TWO_WHEELER) {
            throw new IllegalArgumentException(INVALID_VEHICLE_TYPE) ;
        }
        return BASE_FEE + (PER_HOUR_FEE * duration);
    }
}
