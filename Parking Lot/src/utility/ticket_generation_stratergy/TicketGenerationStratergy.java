package utility.ticket_generation_stratergy;

import entities.ticket.Ticket;
import managers.parking_spot.ParkingSpotManager;
import utility.parking_stratergy.ParkingStratergy;
import entities.vehicles.Vehicle;

import java.time.LocalDateTime;

public interface TicketGenerationStratergy {
    public Ticket generateTicket(Vehicle vehicle , ParkingSpotManager parkingSpotManager);
    public int calculateHours(LocalDateTime start , LocalDateTime end);
}
