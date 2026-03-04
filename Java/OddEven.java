package Java;
import java.util.Scanner;

public class OddEven {
	
	public static String oddEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			return "This is a Even Number";
		} else {
			return "This is a Odd Number";
		}
	}

	public static void main(String[] args) {
		String result = oddEven();
		System.out.println(result);
	}

}
