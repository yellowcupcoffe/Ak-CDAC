package Java;

import java.util.Scanner;

public class UpdateArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the The size of the array: ");
		int size = sc.nextInt();
		
		System.out.print("Enter the Element of the Array: ");
		int[] arr = new int[size];
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.print("Choose the Index of the Array you want to update it with:  ");
		int choice = sc.nextInt();
		System.out.print("what do you wwant to change it with: ");
		int change = sc.nextInt();
		arr[choice] = change;
		
		System.out.println();
		System.out.println("Now the array is like this: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " " );

	}

}
}