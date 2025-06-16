package utility.ticket_generation_stratergy;

import constants.ParkingConstants;
import constants.ParkingExceptionConstants;
import entities.parking_spot.ParkingSpot;
import entities.ticket.Ticket;
import entities.vehicles.Vehicle;
import exceptions.ParkingSpotException;
import factory.ParkingStratergyFactory;
import managers.parking_spot.ParkingSpotManager;
import utility.parking_stratergy.ParkingStratergy;

public class FirstFloorTicketGeneration implements TicketGenerationStratergy{
    @Override
    public Ticket generateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {
        ParkingStratergy parkingStratergy = new ParkingStratergyFactory().createParkingStrategy(ParkingConstants.DEFAULT_PARKING_STRATERGY);

        Ticket ticket = null;
        try {
            if (parkingStratergy != null) {
                ParkingSpot parkingSpot = parkingStratergy.allocateSpot(vehicle, parkingSpotManager);
                if (parkingSpot != null) {
                    ticket = new Ticket(vehicle, parkingSpot);
                }

            }
        } catch (ParkingSpotException e) {
            throw new ParkingSpotException(ParkingExceptionConstants.No_EMPTY_SLOT_FIRST_FLOOR);
        }
        return ticket;
    }
}
