import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager flightManager = new FlightManager();
        TicketManager ticketManager = new TicketManager();

        while (true) {
            System.out.println("+----------------------------------------------------+");
            System.out.println("|              Welcome to ViSH AIR                   |");
            System.out.println("+----------------------------------------------------+");
            System.out.println("| 1. Add Flight                                      |");
            System.out.println("| 2. View Flights                                    |");
            System.out.println("| 3. Book Ticket                                     |");
            System.out.println("| 4. Cancel Ticket                                   |");
            System.out.println("| 5. View Tickets                                    |");
            System.out.println("| 6. Exit                                            |");
            System.out.println("+----------------------------------------------------+");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            switch (option) {
                case 1:
                    System.out.print("Enter flight number: ");
                    String fNum = scanner.nextLine();
                    System.out.print("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String dest = scanner.nextLine();
                    System.out.print("Enter date (e.g., 2024-12-31): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter total seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();

                    Flight flight = new Flight(fNum, origin, dest, date, seats);
                    flightManager.addFlight(flight);
                    System.out.println("Flight added successfully.");
                    break;

                case 2:
                    flightManager.viewFlights();
                    break;

                case 3:
                    System.out.print("Enter flight number: ");
                    String flightId = scanner.nextLine();
                    Flight bookFlight = flightManager.getFlight(flightId);
                    if (bookFlight == null) {
                        System.out.println("Flight not found.");
                        break;
                    }

                    if (!bookFlight.hasAvailableSeats()) {
                        System.out.println("No available seats.");
                        break;
                    }

                    System.out.print("Enter passenger ID: ");
                    String pId = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Passenger passenger = new Passenger(pId, pName, email);
                    String ticketId = "TICKET" + System.currentTimeMillis();

                    Ticket ticket = ticketManager.bookTicket(ticketId, bookFlight, passenger);
                    if (ticket != null) {
                        System.out.println("Ticket booked successfully! Ticket ID: " + ticket.getTicketId());
                    } else {
                        System.out.println("Failed to book ticket.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ticket ID to cancel: ");
                    String cancelId = scanner.nextLine();
                    ticketManager.cancelTicket(cancelId);
                    break;

                case 5:
                    ticketManager.viewTickets();
                    break;

                case 6:
                    System.out.println("Thank you for using ViSH AIR!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
    }
}
