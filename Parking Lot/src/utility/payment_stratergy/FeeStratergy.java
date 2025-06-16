package utility.payment_stratergy;

import entities.vehicles.VehicleType;

public interface FeeStratergy {
    public double getFee(VehicleType vehicleType, double duration);
}
