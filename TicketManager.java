import java.util.*;

public class TicketManager {
    private Map<String, Ticket> tickets = new HashMap<>();

    public Ticket bookTicket(String ticketId, Flight flight, Passenger passenger) {
        if (flight.hasAvailableSeats()) {
            flight.bookSeat();
            Ticket ticket = new Ticket(ticketId, flight, passenger);
            tickets.put(ticketId, ticket);
            return ticket;
        }
        return null;
    }

    public void cancelTicket(String ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket != null) {
            ticket.getFlight().cancelSeat();
            tickets.remove(ticketId);
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("Ticket not found.");
        }
    }

    public void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked.");
        } else {
            for (Ticket ticket : tickets.values()) {
                System.out.println(ticket);
            }
        }
    }
}
