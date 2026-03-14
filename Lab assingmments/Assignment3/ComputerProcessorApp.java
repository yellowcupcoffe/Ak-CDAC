import java.util.Scanner;

class Processor {
    String processorName;
    double speed; // in GHz

    Processor(String processorName, double speed) {
        this.processorName = processorName;
        this.speed = speed;
    }

    void displayProcessor() {
        System.out.println("Processor  : " + processorName);
        System.out.println("Speed      : " + speed + " GHz");
    }
}

class Computer {
    String brand;
    String model;
    Processor processor; // Has-A relationship

    Computer(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }

    void displayComputer() {
        System.out.println("\n--- Computer Details ---");
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        processor.displayProcessor();
    }
}

public class ComputerProcessorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of computers: ");
        int n = sc.nextInt();
        Computer[] computers = new Computer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Computer " + (i + 1) + " ---");
            sc.nextLine();
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Model: ");
            String model = sc.nextLine();
            System.out.print("Processor Name: ");
            String procName = sc.nextLine();
            System.out.print("Processor Speed (GHz): ");
            double speed = sc.nextDouble();
            Processor proc = new Processor(procName, speed);
            computers[i] = new Computer(brand, model, proc);
        }

        System.out.println("\n========== COMPUTER DETAILS ==========");
        for (Computer c : computers) {
            c.displayComputer();
        }
        sc.close();
    }
}
