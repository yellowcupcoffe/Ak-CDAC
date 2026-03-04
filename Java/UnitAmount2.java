package Java;

import java.util.Scanner;


public class UnitAmount2 {
public static int calcUnitAmt(int units) {
		
		int amount = 0;
		int rate = 1;
		
		while(units > 0) {
			int slabunits = Math.min(100, units);
			amount = amount + (slabunits * rate); 
			units = units - slabunits;
			
		if(rate < 4) {
			rate++;
		}
					
	  }
		return amount;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number of units : ");
		
		int units = sc.nextInt();
		
		int Totalamt = calcUnitAmt(units);
		
		System.out.print("Total amount according to number of units is " + Totalamt + " Rs.");

	}

}
