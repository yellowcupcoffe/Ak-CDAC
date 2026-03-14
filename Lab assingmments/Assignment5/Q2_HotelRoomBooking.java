import java.util.Scanner;

class RoomBooking {
    // Overloaded method 1: only days
    double calculateCost(int numberOfDays) {
        return numberOfDays * 1000.0; // default Rs. 1000 per day
    }

    // Overloaded method 2: days + cost per day
    double calculateCost(int numberOfDays, double costPerDay) {
        return numberOfDays * costPerDay;
    }

    // Overloaded method 3: days + cost per day + food charges
    double calculateCost(int numberOfDays, double costPerDay, double foodCharges) {
        return (numberOfDays * costPerDay) + foodCharges;
    }
}

public class Q2_HotelRoomBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomBooking rb = new RoomBooking();
        boolean running = true;

        while (running) {
            System.out.println("\n===== HOTEL ROOM BOOKING =====");
            System.out.println("1. Calculate Cost (days only)");
            System.out.println("2. Calculate Cost (days + cost/day)");
            System.out.println("3. Calculate Cost (days + cost/day + food charges)");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of days: ");
                    int d1 = sc.nextInt();
                    System.out.println("Total Cost = Rs. " + rb.calculateCost(d1));
                    break;
                case 2:
                    System.out.print("Enter number of days: ");
                    int d2 = sc.nextInt();
                    System.out.print("Enter cost per day: ");
                    double cpd = sc.nextDouble();
                    System.out.println("Total Cost = Rs. " + rb.calculateCost(d2, cpd));
                    break;
                case 3:
                    System.out.print("Enter number of days: ");
                    int d3 = sc.nextInt();
                    System.out.print("Enter cost per day: ");
                    double cpd2 = sc.nextDouble();
                    System.out.print("Enter food charges: ");
                    double food = sc.nextDouble();
                    System.out.println("Total Cost = Rs. " + rb.calculateCost(d3, cpd2, food));
                    break;
                case 4:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
