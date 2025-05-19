import java.util.*;

public class FlightManager {
    private Map<String, Flight> flights = new HashMap<>();

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }

    public void viewFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
        } else {
            for (Flight flight : flights.values()) {
                System.out.println(flight);
            }
        }
    }
}
