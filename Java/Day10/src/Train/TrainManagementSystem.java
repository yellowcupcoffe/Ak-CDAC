package Train;

import java.util.Scanner;

public class TrainManagementSystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TrainStationController t1 = new TrainStationController();
		
		/*t1.AddStation();
		t1.AddStartStation();
		t1.AddLastStation();
		t1.displayAll(); */
		
		System.out.println("========Welcome to Train Management Station=========");
		int choice =0;
		
		do {
			System.out.println("1. Add Station");
			System.out.println("2. Display All Stations");
			System.out.println("3. Add Station At the Start");
			System.out.println("4. Add Station at the End");
			System.out.println("5. Remove a Station?");
			System.out.println("6. Remove First Station?");
			System.out.println("7. Remove Last Station?");
			System.out.println("8. Exit");
			
			choice = sc.nextInt();
			switch(choice) {
			
			 case 1: 
				 System.out.println("Enter the Station Name you wanna Add");
				 String stationName = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the Staion ID: ");
				 String stationId = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the Arrival Time: ");
				 String arrivalTime = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Station Successfully Added");
				 t1.AddStation(stationId,stationName,arrivalTime);
				 break;
				 
			 case 2: 
				 t1.displayAll();
				 break;
			 case 3: 
				 System.out.println("Enter the Station Name at the first you wanna Add");
				 String stationFName = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the First Staion ID: ");
				 String stationFId = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the Arrival Time for First Station: ");
				 String arrivalFTime = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Station Successfully Added at First");
				 t1.AddStartStation(stationFId,stationFName,arrivalFTime);
				 break;
			 case 4:
				 System.out.println("Enter the Station Name at the End you wanna Add");
				 String stationEName = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the End Staion ID: ");
				 String stationEId = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Enter the Arrival Time for End Station: ");
				 String arrivalETime = sc.nextLine();
				 sc.nextLine();
				 System.out.println("Station Successfully Added at End");
				 t1.AddLastStation(stationEId,stationEName,arrivalETime);
				 break;
			 case 5:
				 System.out.println("tell me the Station ID you wanna remove: ");
				 String RstationId = sc.nextLine();
				 sc.hasNextLine();
				 t1.RemoveStationByName(RstationId);
				 break;
			 case 6: 
				 t1.RemoveStationStart();
				 break;
			 case 7:
				 t1.RemoveStationLast();
				 break;
			 case 8: 
				 System.out.println("Thank you!");
				 break;
			default:
				System.out.println("Enter Valid Input");
				break;
				 
			
			
			
			
			
			
			}
			
		} while(choice != 8); {
			
		}
		
	}
	
}
