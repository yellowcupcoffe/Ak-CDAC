package Web;

import java.util.Scanner;

public class WebPageController {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		webPageInternet page = new webPageInternet();
		
		
		
		System.out.println("========Welcome to Browser=========");
		
		
		
		
		int choice =0;
		
		
		
		
		
		do {
			System.out.println();
			System.out.println("1. Visit Page");
			System.out.println("2. Current Page");
			System.out.println("3. Go Back");
			System.out.println("4. Browser History");
			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();
		switch(choice) {
			case 1: 
				sc.nextLine();
				System.out.print("Enter the URL: ");
				String url = sc.nextLine();
				page.VisitPage(url);
				break;
				
			case 2:
				page.currentPage();
				break;
				
			case 3:
				page.GoBack();
				break;
				
			case 4:
				page.showHitory();
				break;
				
			case 5:
				System.out.println("Thank you!");
			
			default :
				System.out.println("Enter a Valid choice!!");
		} 
		}while(choice !=5);
	}
}
		
		
		
		
		
		
		
		

