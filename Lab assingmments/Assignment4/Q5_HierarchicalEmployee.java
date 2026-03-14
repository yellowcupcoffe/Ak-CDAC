import java.util.Scanner;

class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int empId, String empName, String programmingLanguage) {
        super(empId, empName);
        this.programmingLanguage = programmingLanguage;
    }

    void showDeveloperDetails() {
        displayEmployee();
        System.out.println("Role          : Developer");
        System.out.println("Language      : " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    Tester(int empId, String empName, String testingTool) {
        super(empId, empName);
        this.testingTool = testingTool;
    }

    void showTesterDetails() {
        displayEmployee();
        System.out.println("Role          : Tester");
        System.out.println("Testing Tool  : " + testingTool);
    }
}

public class Q5_HierarchicalEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== EMPLOYEE ROLE SYSTEM =====");
            System.out.println("1. Add Developer");
            System.out.println("2. Add Tester");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Employee ID: ");
                    int dId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String dName = sc.nextLine();
                    System.out.print("Programming Language: ");
                    String lang = sc.nextLine();
                    Developer dev = new Developer(dId, dName, lang);
                    System.out.println("\n--- Developer Details ---");
                    dev.showDeveloperDetails();
                    break;
                case 2:
                    System.out.print("Employee ID: ");
                    int tId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String tName = sc.nextLine();
                    System.out.print("Testing Tool: ");
                    String tool = sc.nextLine();
                    Tester tester = new Tester(tId, tName, tool);
                    System.out.println("\n--- Tester Details ---");
                    tester.showTesterDetails();
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
