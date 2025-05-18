import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
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

            System.out.println("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Adding a Flight ...");
                    break;
                case 2:
                    System.out.println("Displaying Flights ...");
                    break;
                case 3:
                    System.out.println("Booking a Ticket ...");
                    break;
                case 4:
                    System.out.println("Cancelling a Ticket ...");
                    break;
                case 5:
                    System.out.println("Displaying Tickets ...");
                    break;
                case 6:
                    System.out.println("Exiting the System ...");
                    return;
                default:
                    System.out.println("INVALID OPTION !!!");
            }
            System.out.println();
        }


        }
    }
}
