package Java;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the The size of the array: ");
		int size = sc.nextInt();
		
		System.out.print("Enter the Element of the Array: ");
		int[] arr = new int[size];
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("Intially the array is like this: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " " );
		}
		
		System.out.println();
		System.out.println("Now the array is like this: ");
		for(int i=size-1;i>-1;i--) {
			System.out.print(arr[i] + " " );
		}

	}

}
