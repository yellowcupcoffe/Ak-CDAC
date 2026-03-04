package Java;
import java.util.Scanner;


public class LargestNumber {
	
	public static  String Largest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		
		System.out.println("ENter the Second Number: ");
		int b = sc.nextInt();
		
		if(a < b) {  
			return "The Second number is Larger";
		}  else if(a == b) {
			return "both Numbers are same only!!";
		} else {
			return "The First Number is Larger";
		}
				
	}

	public static void main(String[] args) {
			String result = Largest();
			System.out.println(result);
	}

}
