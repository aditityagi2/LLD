package managers.entrance_gate;

import entities.ticket.Ticket;
import managers.parking_spot.ParkingSpotManager;
import utility.parking_stratergy.ParkingStratergy;
import entities.vehicles.Vehicle;
import utility.ticket_generation_stratergy.FirstFloorTicketGeneration;

public class FirstEntranceGateManager implements EntranceManager {

    @Override
    public Ticket generateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {
        Ticket ticket = null;
        try{
            FirstFloorTicketGeneration firstFloorTicketGeneration = new FirstFloorTicketGeneration();
            ticket = firstFloorTicketGeneration.generateTicket(vehicle , parkingSpotManager);

        }catch (Exception e ){
            e.printStackTrace();
        }

        return ticket;

    }
}
