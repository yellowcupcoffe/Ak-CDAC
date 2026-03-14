import java.util.Scanner;

class Movie {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    Movie(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    class TicketBooking {
        double calculateCost() {
            double total = ticketPrice * numberOfTickets;
            if (numberOfTickets > 5) {
                total -= 100;
                System.out.println("Discount: Rs. 100 (more than 5 tickets)");
            }
            return total;
        }

        void displayBooking() {
            System.out.println("\n--- Movie Ticket Booking ---");
            System.out.println("Movie Name      : " + movieName);
            System.out.println("Ticket Price    : Rs. " + ticketPrice);
            System.out.println("No. of Tickets  : " + numberOfTickets);
            System.out.println("Total Cost      : Rs. " + calculateCost());
        }
    }
}

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of movie bookings: ");
        int n = sc.nextInt();
        Movie[] movies = new Movie[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Booking " + (i + 1) + " ---");
            sc.nextLine();
            System.out.print("Movie Name: ");
            String name = sc.nextLine();
            System.out.print("Ticket Price: ");
            double price = sc.nextDouble();
            System.out.print("Number of Tickets: ");
            int tickets = sc.nextInt();
            movies[i] = new Movie(name, price, tickets);
        }

        System.out.println("\n========== MOVIE BOOKINGS ==========");
        for (Movie m : movies) {
            Movie.TicketBooking tb = m.new TicketBooking();
            tb.displayBooking();
        }
        sc.close();
    }
}
