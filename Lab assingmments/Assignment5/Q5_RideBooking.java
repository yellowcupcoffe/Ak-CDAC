import java.util.Scanner;

class Ride {
    void calculateFare(double distance) {
        System.out.println("Base Fare for " + distance + " km");
    }
}

class BikeRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double rate = 8.0; // Rs. 8 per km
        double fare = distance * rate;
        System.out.println("[Bike Ride]");
        System.out.println("Distance    : " + distance + " km");
        System.out.println("Rate        : Rs. " + rate + "/km");
        System.out.println("Total Fare  : Rs. " + fare);
    }
}

class CabRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double rate = 15.0; // Rs. 15 per km
        double baseFare = 50.0;
        double fare = baseFare + (distance * rate);
        System.out.println("[Cab Ride]");
        System.out.println("Distance    : " + distance + " km");
        System.out.println("Base Fare   : Rs. " + baseFare);
        System.out.println("Rate        : Rs. " + rate + "/km");
        System.out.println("Total Fare  : Rs. " + fare);
    }
}

class AutoRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double rate = 12.0; // Rs. 12 per km
        double minimumFare = 30.0;
        double fare = distance * rate;
        if (fare < minimumFare) fare = minimumFare;
        System.out.println("[Auto Ride]");
        System.out.println("Distance    : " + distance + " km");
        System.out.println("Rate        : Rs. " + rate + "/km");
        System.out.println("Minimum Fare: Rs. " + minimumFare);
        System.out.println("Total Fare  : Rs. " + fare);
    }
}

public class Q5_RideBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== RIDE BOOKING SYSTEM =====");
            System.out.println("1. Bike Ride");
            System.out.println("2. Cab Ride");
            System.out.println("3. Auto Ride");
            System.out.println("4. Exit");
            System.out.print("Select ride type: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting. Thank you!");
                running = false;
                continue;
            }

            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();
            Ride ride;

            switch (choice) {
                case 1:
                    ride = new BikeRide();
                    ride.calculateFare(distance);
                    break;
                case 2:
                    ride = new CabRide();
                    ride.calculateFare(distance);
                    break;
                case 3:
                    ride = new AutoRide();
                    ride.calculateFare(distance);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
