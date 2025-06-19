package entities.ticket;

import entities.parking_spot.ParkingSpot;
import entities.vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    private static int ticketCounter = 0;
    private int id ;
    private double price ;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle ;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime ;

    public Ticket(Vehicle vehicle , ParkingSpot parkingSpot){
        this.id = ++ticketCounter;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
    }


    public static int getTicketCounter() {
        return ticketCounter;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public static void setTicketCounter(int ticketCounter) {
        Ticket.ticketCounter = ticketCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public void setExitTime(LocalDateTime exitTime){
        this.exitTime = exitTime ;
    }

    public LocalDateTime getExitTime(){
        return this.exitTime ;
    }
}
