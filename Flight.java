public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String date;
    private int totalSeats;
    private int bookedSeats;

    public Flight(String flightNumber, String origin, String destination, String date, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public boolean hasAvailableSeats() {
        return bookedSeats < totalSeats;
    }

    public void bookSeat() {
        if (hasAvailableSeats()) bookedSeats++;
    }

    public void cancelSeat() {
        if (bookedSeats > 0) bookedSeats--;
    }

    public String toString() {
        return flightNumber + ": " + origin + " -> " + destination + " on " + date +
                " | Seats: " + bookedSeats + "/" + totalSeats;
    }
}
