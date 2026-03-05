package cdac;

public class Vehicle {
	
	int vehicleNumber;
	String brand;
	
	Vehicle(int vehicleNumber, String brand) {
		
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
	}
	
	public void showVehicleInfo() {
		
		System.out.println("\nVehicle Numbere : " + vehicleNumber);
		System.out.println("Vehicle Brand : " + brand);
		
	}

}

class Car extends Vehicle {
	
	double price;
	int GST;
	double TotalCarPrice;
	
    public static Car createCar() {
        
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the Vehicle Number: ");
        int vehicleNumber  = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Enter GST Percentage: ");
        int GST = sc.nextInt();        

        return new Car(vehicleNumber, brand, price, GST);
    }

	Car(int vehicleNumber, String brand, double price, int GST) {
		
		super(vehicleNumber,brand);
		this.price = price;
		this.GST = GST;
		
		CalcCarPrice(price,GST);
		
	}
	
	public double CalcCarPrice(double price, int GST) {
		
		TotalCarPrice = price + ((price*GST)/100);
		
		return TotalCarPrice;
	}
	
	public void displayCarPrice() {
		
		System.out.println("Car Base Price : " + price);
		System.out.println("Total Car Price : " + TotalCarPrice);
		
	}
	
	
}