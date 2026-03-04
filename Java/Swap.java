package Java;
import java.util.Scanner;




public class Swap {
			
	 public static int[] swapN(int[] arr) {
		 arr[0] = arr[0] + arr[1];
		 arr[1] = arr[0] - arr[1];
		 arr[0] = arr[0] - arr[1];
		 
		 return arr;
	 }
	 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		for(int i=1; i<3;i++) {
			if(i == 1) {
				System.out.print("Enter the first Element A: ");
				arr[0] = sc.nextInt();
			} else {
				System.out.print("now, Enter the Second Elemnet B: ");
				arr[1] = sc.nextInt(); 
			}
			
			
		}
		
		System.out.println("So, currently A = " + arr[0] + " and B = " + arr[1]);
		
		int[] res = swapN(arr);
		
		System.out.println("and after swaping the values, A is now " + arr[0] + " and B is now " + arr[1]  );
		
			
	}

}
