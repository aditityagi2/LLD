package managers.exit_gate;

import entities.ticket.Ticket;
import factory.FeeStartegyFactory;
import managers.entrance_gate.EntranceManager;
import utility.payment_stratergy.FeeStratergy;

import static entities.vehicles.VehicleType.TWO_WHEELER;


public class FirstFloorExitGateManager implements ExitGateManager {

    @Override
    public boolean exitParking(Ticket ticket , int hours) {
        try{
            FeeStratergy feeStratergy = new FeeStartegyFactory().getFeeStartergy(TWO_WHEELER);
            double fee = feeStratergy.getFee(ticket.getVehicle().getVehicleType(), hours);
            ticket.setPrice(fee);
            ticket.getParkingSpot().removeVehicle();
            System.out.println("Vehicle with number " + ticket.getVehicle().getLicensePlate() + " has exited the parking lot."+ " Fee charged: " + fee);
            return true;
        }catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }
}

