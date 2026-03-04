package Java;
import java.util.Scanner;


public class Avgmarks {
	
	
			public static int avgmarks(int p, int c , int m) {
		return (p + c + m)/3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose the Subject for couse1: ");
		String p = sc.nextLine();
		
		System.out.print("Enter the marks for " + p + " :  "  );
		int py = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Choose the Subject for couse2 : ");
		String c = sc.nextLine();
		
		
		System.out.print("Enter the marks for " + c + " :  " );
		int ch = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("Choose the Subject for couse3:  ");
		String m = sc.nextLine();
		
		
		System.out.print("Enter the marks for " + m + " :  ");
		int mt = sc.nextInt();
		sc.nextLine();
		int r = avgmarks(py,ch,mt);
		
		System.out.println("so your avg marks of " + p + ", " + c + ", " + " & " + m + " is: " + r   );
	}

}
