import java.util.Scanner;

class Room {
    int roomNumber;
    String roomType;
    double pricePerNight;
    int numberOfDays;

    Room(int roomNumber, String roomType, double pricePerNight, int numberOfDays) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.numberOfDays = numberOfDays;
    }

    class Booking {
        double calculateBill() {
            double total = pricePerNight * numberOfDays;
            if (numberOfDays > 5) {
                double discount = total * 0.20;
                System.out.println("Discount (20%): Rs. " + discount);
                total -= discount;
            }
            return total;
        }

        void displayBooking() {
            System.out.println("\n--- Hotel Booking ---");
            System.out.println("Room Number    : " + roomNumber);
            System.out.println("Room Type      : " + roomType);
            System.out.println("Price/Night    : Rs. " + pricePerNight);
            System.out.println("Number of Days : " + numberOfDays);
            System.out.println("Total Bill     : Rs. " + calculateBill());
        }
    }
}

public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        Room[] rooms = new Room[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Booking " + (i + 1) + " ---");
            System.out.print("Room Number: ");
            int roomNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Room Type (Deluxe/Standard/Suite): ");
            String type = sc.nextLine();
            System.out.print("Price per Night: ");
            double price = sc.nextDouble();
            System.out.print("Number of Days: ");
            int days = sc.nextInt();
            rooms[i] = new Room(roomNo, type, price, days);
        }

        System.out.println("\n========== HOTEL BOOKINGS ==========");
        for (Room r : rooms) {
            Room.Booking booking = r.new Booking();
            booking.displayBooking();
        }
        sc.close();
    }
}
