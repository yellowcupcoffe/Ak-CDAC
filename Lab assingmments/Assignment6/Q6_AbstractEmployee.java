import java.util.Scanner;

abstract class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    abstract double calculateSalary();

    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : Rs. " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double basicSalary;
    double hra;
    double allowance;

    FullTimeEmployee(int empId, String empName, double basicSalary, double hra, double allowance) {
        super(empId, empName);
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra + allowance;
    }
}

class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int empId, String empName, int hoursWorked, double hourlyRate) {
        super(empId, empName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Q6_AbstractEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== EMPLOYEE SALARY SYSTEM (Abstract) =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Contract Employee");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Employee ID: ");
                    int fId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Basic Salary: ");
                    double basic = sc.nextDouble();
                    System.out.print("HRA: ");
                    double hra = sc.nextDouble();
                    System.out.print("Allowance: ");
                    double allowance = sc.nextDouble();
                    Employee ft = new FullTimeEmployee(fId, fName, basic, hra, allowance);
                    System.out.println("\n--- Full-Time Employee ---");
                    ft.displayEmployee();
                    break;
                case 2:
                    System.out.print("Employee ID: ");
                    int cId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.print("Hourly Rate: ");
                    double rate = sc.nextDouble();
                    Employee ct = new ContractEmployee(cId, cName, hours, rate);
                    System.out.println("\n--- Contract Employee ---");
                    ct.displayEmployee();
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
