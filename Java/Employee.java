package cdac;

public class Employee {
	// empId, name, basicSalary
	
	int empId;
	String name;
	double basicSalary;

	Employee(int empId, String name, double basicSalary){
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("\nEmployee Emp ID: " + empId );
		System.out.println("Employee Name: " + name );
		System.out.println("Basic Salary: " + basicSalary );
		
	}
}

 class Manager extends Employee{
	double bonus;
	
	Manager(int empId, String name, double basicSalary, double bonus){
		super(empId,name, basicSalary);
		this.bonus = bonus;
	}
	
	
	public void calculateSalary() {
		
		System.out.println("Bonus : " + bonus);
		double TotalSalary = basicSalary + bonus;
		System.out.println("Total Salary: " + TotalSalary );
		System.out.println("----------------------------------------------------");
	}
	
}