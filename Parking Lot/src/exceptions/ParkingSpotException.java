package exceptions;

public class ParkingSpotException extends RuntimeException {
    public ParkingSpotException(String errorMessage){
        super(errorMessage);
    }
}
