import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String department;
    double salary;

    Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + empId + " | Name: " + empName + " | Dept: " + department + " | Salary: Rs. " + salary;
    }
}

public class Q5_EmployeeHashMap {
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {
        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with ID " + id + " already exists!");
            return;
        }
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        employeeMap.put(id, new Employee(id, name, dept, salary));
        System.out.println("Employee added successfully!");
    }

    static void displayAll() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\n--- All Employees ---");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Found: " + employeeMap.get(id));
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.print("New Name: ");
            String name = sc.nextLine();
            System.out.print("New Department: ");
            String dept = sc.nextLine();
            System.out.print("New Salary: ");
            double salary = sc.nextDouble();
            employeeMap.put(id, new Employee(id, name, dept, salary));
            System.out.println("Employee updated!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        if (employeeMap.remove(id) != null) {
            System.out.println("Employee deleted!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n===== EMPLOYEE RECORD MANAGEMENT (HashMap) =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: displayAll(); break;
                case 3: searchEmployee(); break;
                case 4: updateEmployee(); break;
                case 5: deleteEmployee(); break;
                case 6:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default: System.out.println("Invalid option!");
            }
        }
    }
}
