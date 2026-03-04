package Java;

import java.util.Scanner;


public class AreaOfARectangle {
	
	public static int araa(int l, int b) {
		int arearct = l*b;
		return arearct;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		int length = sc.nextInt();
		
		System.out.print("Enter the breadth of the rectangle: ");
		int breadth = sc.nextInt();
		
		
		int results =araa(length, breadth);
		
		System.out.println("The final answer is : " + results );
		
	}

}
