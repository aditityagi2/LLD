package utility.ticket_generation_stratergy;

import entities.ticket.Ticket;
import managers.parking_spot.ParkingSpotManager;
import utility.parking_stratergy.ParkingStratergy;
import entities.vehicles.Vehicle;

public interface TicketGenerationStratergy {
    public Ticket generateTicket(Vehicle vehicle , ParkingSpotManager parkingSpotManager);
}
