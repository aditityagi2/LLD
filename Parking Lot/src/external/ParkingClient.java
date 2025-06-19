package external;

import entities.parking_spot.ParkingSpot;
import entities.ticket.Ticket;
import entities.vehicles.Vehicle;
import factory.ParkingManagerFactory;
import factory.ParkingSpotFactory;
import factory.ParkingStratergyFactory;
import managers.entrance_gate.EntranceManager;
import managers.entrance_gate.FirstEntranceGateManager;
import managers.exit_gate.ExitGateManager;
import managers.exit_gate.FirstFloorExitGateManager;
import managers.parking_spot.ParkingSpotManager;
import utility.ticket_generation_stratergy.FirstFloorTicketGeneration;
import utility.ticket_generation_stratergy.TicketGenerationStratergy;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import static entities.vehicles.VehicleType.TWO_WHEELER;

public class ParkingClient {



    public static void main(String args[]){

        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
        ParkingStratergyFactory parkingStratergyFactory = new ParkingStratergyFactory();
        EntranceManager entrance = new FirstEntranceGateManager();
        ExitGateManager exit = new FirstFloorExitGateManager();
        TicketGenerationStratergy ticketGenerationStratergy = new FirstFloorTicketGeneration();



        try {
            ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(TWO_WHEELER);

            //Add Parking Spots

            for(int i =-0 ; i < 10 ; i++){
               parkingSpotManager.addParkingSpot(parkingSpotFactory.getParkingSpot(TWO_WHEELER));
            }

            //Simulate Vehicle Entry
            System.out.println("==================Vehicle Entry=================");
            Vehicle bike = new Vehicle("RJ14AB1234" , TWO_WHEELER);
            Ticket ticket = entrance.generateTicket(bike, parkingSpotManager);
            System.out.println("Parked Bike : "+ ticket.getVehicle().getLicensePlate());

            //Simulate Vehicle exit
            System.out.println("==================Vehicle Exit=================");
            if(bike != null){
                ticket.setExitTime(LocalDateTime.now());
                int hours = ticketGenerationStratergy.calculateHours (ticket.getExitTime() , ticket.getEntryTime());
                boolean b = exit.exitParking(ticket, hours);
                if(b == true ){
                    System.out.println("Bike Exit :" + ticket.getVehicle().getLicensePlate() + " Total amount : "+ ticket.getPrice());
                }else{
                    System.out.println("Problem Exiting Bike :" + ticket.getVehicle().getLicensePlate() + " Toatal amount : "+ ticket.getPrice());
                }
            }

        } catch (IllegalAccessException e) {
            System.out.println("Unable to park vehicle ");
        }



    }
}
