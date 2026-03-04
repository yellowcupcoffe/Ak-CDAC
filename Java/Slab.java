package Java;
import java.util.Scanner;

public class Slab {

    // Renamed to camelCase (Standard Java Practice)
    public static int calcUnitAmount(int unit) {
        int amount = 0;

        // Slab 1: 1-100
        if (unit > 100) {
            amount += 100 * 1;
            unit -= 100;
        } else {
            return amount + (unit * 1);
        }

        // Slab 2: 101-200
        if (unit > 100) {
            amount += 100 * 2;
            unit -= 100;
        } else {
            return amount + (unit * 2);
        }

        // Slab 3: 201-300
        if (unit > 100) {
            amount += 100 * 3;
            unit -= 100;
        } else {
            return amount + (unit * 3);
        }

        // Slab 4: Above 300
        amount += unit * 4;
        return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your units: ");
        
        // Validation: Ensure the user enters a number
        if (sc.hasNextInt()) {
            int unit = sc.nextInt();
            int totalUnitAmount = calcUnitAmount(unit);
            System.out.println("Total amount for the units is: " + totalUnitAmount + " Rs.");
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close(); // Good practice to close the scanner
    }
}