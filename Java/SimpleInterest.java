package Java;
import java.util.Scanner;


public class SimpleInterest {
	
	public static double getPrincpal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Princpal Amount:  ");
		double p = sc.nextDouble();
		return p;
	}
	
	
	public static double getRateOfInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rate of Interest: ");
		double i = sc.nextDouble();
		return i;
	}
	
	
	public static int getTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time Period: ");
		int t = sc.nextInt();
		return t;
	}
	
	public static double SimpleInterest(double p, double r, int t) {
		double si = ( p * t * r ) /100;
		return si;
	}
	
	
	
	
	public static void main(String[] args) {
		double p = getPrincpal();
		double r = getRateOfInterest();
		int t = getTime();
		
		double si = SimpleInterest(p,r,t);
		System.out.println("The Simple Interest is: " + si + " and total amount after Interst is "+ (p+ si));
		
	}

}
