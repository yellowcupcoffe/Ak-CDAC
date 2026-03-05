package cdac;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee ID: ");
		int empId = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Base Salary: ");
		double basicSalary = sc.nextDouble();
		
		System.out.print("Enter the Bonus: ");
		double bonus = sc.nextDouble();
		
		Manager m = new Manager(empId, name, basicSalary, bonus);
		m.displayEmployeeDetails();
		m.calculateSalary();

	}

}
