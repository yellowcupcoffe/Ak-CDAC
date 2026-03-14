import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    void showVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
    }
}

class Car extends Vehicle {
    double price;

    Car(String vehicleNumber, String brand, double price) {
        super(vehicleNumber, brand);
        this.price = price;
    }

    void displayCarPrice() {
        showVehicleInfo();
        System.out.println("Price          : Rs. " + price);
    }
}

public class Q2_VehicleCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Car " + (i + 1) + " ---");
            sc.nextLine();
            System.out.print("Vehicle Number: ");
            String vNo = sc.nextLine();
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            cars[i] = new Car(vNo, brand, price);
        }

        System.out.println("\n========== CAR DETAILS ==========");
        for (Car c : cars) {
            System.out.println();
            c.displayCarPrice();
        }
        sc.close();
    }
}
