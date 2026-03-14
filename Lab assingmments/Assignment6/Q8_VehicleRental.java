import java.util.Scanner;

interface Rental {
    void rentVehicle();
    double calculateRent();
    void displayDetails();
}

class Car implements Rental {
    String carModel;
    double rentPerDay;
    int numberOfDays;

    Car(String carModel, double rentPerDay, int numberOfDays) {
        this.carModel = carModel;
        this.rentPerDay = rentPerDay;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public void rentVehicle() {
        System.out.println("Car '" + carModel + "' rented for " + numberOfDays + " days.");
    }

    @Override
    public double calculateRent() {
        double total = rentPerDay * numberOfDays;
        if (numberOfDays > 5) {
            double discount = total * 0.10;
            System.out.println("Discount (10% for >5 days): Rs. " + discount);
            total -= discount;
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Car Rental Details ---");
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rent/Day     : Rs. " + rentPerDay);
        System.out.println("Days Rented  : " + numberOfDays);
        System.out.println("Total Rent   : Rs. " + calculateRent());
    }
}

class Bike implements Rental {
    String bikeModel;
    double rentPerDay;
    int numberOfDays;

    Bike(String bikeModel, double rentPerDay, int numberOfDays) {
        this.bikeModel = bikeModel;
        this.rentPerDay = rentPerDay;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public void rentVehicle() {
        System.out.println("Bike '" + bikeModel + "' rented for " + numberOfDays + " days.");
    }

    @Override
    public double calculateRent() {
        double total = rentPerDay * numberOfDays;
        if (numberOfDays > 3) {
            double discount = total * 0.05;
            System.out.println("Discount (5% for >3 days): Rs. " + discount);
            total -= discount;
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Bike Rental Details ---");
        System.out.println("Bike Model   : " + bikeModel);
        System.out.println("Rent/Day     : Rs. " + rentPerDay);
        System.out.println("Days Rented  : " + numberOfDays);
        System.out.println("Total Rent   : Rs. " + calculateRent());
    }
}

public class Q8_VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Car Model: ");
                    String carModel = sc.nextLine();
                    System.out.print("Rent per Day: ");
                    double carRent = sc.nextDouble();
                    System.out.print("Number of Days: ");
                    int carDays = sc.nextInt();
                    Car car = new Car(carModel, carRent, carDays);
                    car.rentVehicle();
                    car.displayDetails();
                    break;
                case 2:
                    System.out.print("Bike Model: ");
                    String bikeModel = sc.nextLine();
                    System.out.print("Rent per Day: ");
                    double bikeRent = sc.nextDouble();
                    System.out.print("Number of Days: ");
                    int bikeDays = sc.nextInt();
                    Bike bike = new Bike(bikeModel, bikeRent, bikeDays);
                    bike.rentVehicle();
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.println("Exiting. Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
