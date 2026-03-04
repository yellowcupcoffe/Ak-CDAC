package Java;
import java.util.Scanner;



public class Temp {
			
	
		public static int convo(int c) {
			int f = (c * 9/5 ) + 32;
			return f;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the C : ");
		int c = sc.nextInt();
		
		int r = convo(c);
		
		System.out.println("Results: " + r );
		

	}

}
