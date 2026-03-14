import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    class SalaryCalculator {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double totalSalary = basicSalary + hra + da;

        void displaySalary() {
            System.out.println("\n--- Salary Details ---");
            System.out.println("Employee ID   : " + empId);
            System.out.println("Employee Name : " + empName);
            System.out.println("Basic Salary  : " + basicSalary);
            System.out.println("HRA (20%)     : " + hra);
            System.out.println("DA (10%)      : " + da);
            System.out.println("Total Salary  : " + totalSalary);
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\n========== SALARY REPORT ==========");
        for (Employee emp : employees) {
            Employee.SalaryCalculator calc = emp.new SalaryCalculator();
            calc.displaySalary();
        }
        sc.close();
    }
}
