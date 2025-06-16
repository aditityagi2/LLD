package managers.entrance_gate;

import entities.ticket.Ticket;
import managers.parking_spot.ParkingSpotManager;
import utility.parking_stratergy.ParkingStratergy;
import entities.vehicles.Vehicle;

public interface EntranceManager {
    public Ticket generateTicket(Vehicle vehicle , ParkingSpotManager parkingSpotManager);

}
