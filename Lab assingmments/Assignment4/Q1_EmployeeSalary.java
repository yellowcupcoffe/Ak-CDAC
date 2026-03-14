import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : Rs. " + basicSalary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(int empId, String name, double basicSalary, double bonus) {
        super(empId, name, basicSalary);
        this.bonus = bonus;
    }

    void calculateSalary() {
        double totalSalary = basicSalary + bonus;
        displayEmployeeDetails();
        System.out.println("Bonus         : Rs. " + bonus);
        System.out.println("Total Salary  : Rs. " + totalSalary);
    }
}

public class Q1_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();
        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Manager " + (i + 1) + " ---");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Bonus: ");
            double bonus = sc.nextDouble();
            managers[i] = new Manager(id, name, salary, bonus);
        }

        System.out.println("\n========== MANAGER SALARY REPORT ==========");
        for (Manager m : managers) {
            System.out.println();
            m.calculateSalary();
        }
        sc.close();
    }
}
