public class Ticket {
    private String ticketId;
    private Flight flight;
    private Passenger passenger;

    public Ticket (String ticketId, Flight flight, Passenger passenger) {
        this.ticketId = ticketId;
        this.flight = flight;
        this.passenger = passenger;
    }

    //getters
    public String getTicketId() {
        return ticketId;
    }
    public Flight getflight() {
        return flight;
    }
    public Passenger passenger() {
        return passenger;
    }
}
