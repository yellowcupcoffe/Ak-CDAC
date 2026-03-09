package Java;

import java.util.Scanner;

// Step 1: Input Helper for Clean Code
class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String msg) {
        System.out.print(msg);
        int val = sc.nextInt();
        if (val < 0) {
            System.out.println("Error: Value cannot be negative. Setting to 0.");
            return 0;
        }
        return val;
    }

    public static String readString(String msg) {
        System.out.print(msg);
        return sc.next();
    }

    public static double readDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }
}

// Step 2: Abstract Foundation 
abstract class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Abstract method: Every subclass MUST implement this [cite: 18]
    abstract double calculateSalary();

    public void displayEmployee() {
        System.out.println("\nID: " + empId + " | Name: " + name);
        System.out.println("Calculated Salary: ₹" + calculateSalary());
    }
}

// Step 3: FullTime Implementation [cite: 13]
class FullTimeEmployee extends Employee {
    private double basic, hra, allowance;

    public FullTimeEmployee(int id, String name, double basic, double hra, double allowance) {
        super(id, name);
        this.basic = basic;
        this.hra = hra;
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basic + hra + allowance;
    }
}

// Step 4: Contract Implementation [cite: 13]
class ContractEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public ContractEmployee(int id, String name, int hours, double rate) {
        super(id, name);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

// Step 5: Main Controller [cite: 40]
public class SalarySystem {
    public static void main(String[] args) {
        int size = InputHelper.readInt("Enter total number of employees: ");
        Employee[] employees = new Employee[size]; // Polymorphic Array [cite: 27]

        for (int i = 0; i < size; i++) {
            System.out.println("\nRegistering Employee #" + (i + 1));
            int type = InputHelper.readInt("Type (1 for Full-Time, 2 for Contract): ");
            int id = InputHelper.readInt("Enter ID: ");
            String name = InputHelper.readString("Enter Name: ");

            if (type == 1) {
                double b = InputHelper.readDouble("Basic: ");
                double h = InputHelper.readDouble("HRA: ");
                double a = InputHelper.readDouble("Allowance: ");
                employees[i] = new FullTimeEmployee(id, name, b, h, a);
            } else {
                int hrs = InputHelper.readInt("Hours Worked: ");
                double rate = InputHelper.readDouble("Rate per Hour: ");
                employees[i] = new ContractEmployee(id, name, hrs, rate);
            }
        }

        System.out.println("\n--- Employee Salary Report ---");
        for (Employee e : employees) {
            if (e != null) e.displayEmployee(); // Dynamic Method Dispatch 
        }
    }
}