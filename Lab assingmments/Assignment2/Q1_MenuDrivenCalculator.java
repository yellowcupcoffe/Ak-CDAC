import java.util.Scanner;

public class Q1_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid option! Please select 1-5.");
            }
        }
        sc.close();
    }
}
