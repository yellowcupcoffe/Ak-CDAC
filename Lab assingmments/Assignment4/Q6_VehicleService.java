import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    void displayVehicle() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    double calculateServiceCost() {
        return 5000.0; // Car service cost
    }

    void displayServiceDetails() {
        displayVehicle();
        System.out.println("Type           : Car");
        System.out.println("Service Cost   : Rs. " + calculateServiceCost());
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    double calculateServiceCost() {
        return 2000.0; // Bike service cost
    }

    void displayServiceDetails() {
        displayVehicle();
        System.out.println("Type           : Bike");
        System.out.println("Service Cost   : Rs. " + calculateServiceCost());
    }
}

public class Q6_VehicleService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== VEHICLE SERVICE SYSTEM =====");
            System.out.println("1. Add Car for Service");
            System.out.println("2. Add Bike for Service");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Vehicle Number: ");
                    String cNo = sc.nextLine();
                    System.out.print("Brand: ");
                    String cBrand = sc.nextLine();
                    Car car = new Car(cNo, cBrand);
                    System.out.println("\n--- Car Service Details ---");
                    car.displayServiceDetails();
                    break;
                case 2:
                    System.out.print("Vehicle Number: ");
                    String bNo = sc.nextLine();
                    System.out.print("Brand: ");
                    String bBrand = sc.nextLine();
                    Bike bike = new Bike(bNo, bBrand);
                    System.out.println("\n--- Bike Service Details ---");
                    bike.displayServiceDetails();
                    break;
                case 3:
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
