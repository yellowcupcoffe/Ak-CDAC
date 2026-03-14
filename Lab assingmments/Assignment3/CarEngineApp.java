import java.util.Scanner;

class Engine {
    String engineNumber;
    String engineType;

    Engine(String engineNumber, String engineType) {
        this.engineNumber = engineNumber;
        this.engineType = engineType;
    }

    void displayEngine() {
        System.out.println("Engine Number : " + engineNumber);
        System.out.println("Engine Type   : " + engineType);
    }
}

class Car {
    String carModel;
    String brand;
    Engine engine; // Has-A relationship

    Car(String carModel, String brand, Engine engine) {
        this.carModel = carModel;
        this.brand = brand;
        this.engine = engine;
    }

    void displayCar() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Car Model : " + carModel);
        System.out.println("Brand     : " + brand);
        engine.displayEngine();
    }
}

public class CarEngineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Car " + (i + 1) + " ---");
            sc.nextLine();
            System.out.print("Car Model: ");
            String model = sc.nextLine();
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Engine Number: ");
            String engNo = sc.nextLine();
            System.out.print("Engine Type (Petrol/Diesel/Electric): ");
            String engType = sc.nextLine();
            Engine engine = new Engine(engNo, engType);
            cars[i] = new Car(model, brand, engine);
        }

        System.out.println("\n========== CAR DETAILS ==========");
        for (Car c : cars) {
            c.displayCar();
        }
        sc.close();
    }
}
