package Train;

import java.util.LinkedList;

public class TrainStation {
	String stationId;
	String stationName;
	String arrivalTime;
	
	public TrainStation() {
		
	}

	public TrainStation(String stationId, String stationName, String arrivalTime) {
		this.stationId = stationId;
		this.stationName = stationName;
		this.arrivalTime = arrivalTime;
	}
	
	public String toString() {
	    return stationId + " " + stationName + " " + arrivalTime; 
	}
	
	
	
}


 class TrainStationController{
	 LinkedList<TrainStation> Station = new LinkedList<>();
	 
	 
	 
	 public void AddStation(String stationId, String stationName, String arrivalTime) {
		 Station.add(new TrainStation(stationId, stationName, arrivalTime));
		 
	 }
	 
	 public void displayAll() {
		 System.out.println("Here are all the Station Names ");
		 System.out.println(Station);
		 
	 }
	 
	 public void AddStartStation(String stationId, String stationName, String arrivalTime) {
		 
		 System.out.println("Added Station at the First : " + Station.peekFirst() );
		 
	 }
	 
	 public void AddLastStation(String stationId, String stationName, String arrivalTime) {
		 
		 System.out.println("Added Station at the Last: " + Station.peekLast() );
	 }
	 
	 public void RemoveStationByName(String name) {
		    for (int i = 0; i < Station.size(); i++) {
		        if (Station.get(i).stationName.equals(name)) {
		            Station.remove(i);
		            break;
		        }
		    }
		    System.out.println("Removed Station " + name );
		}
	 
	 
	 public void RemoveStationStart() {
		 Station.removeFirst();
		 System.out.println("Removed The First Station");
	 }
	 
	 
	 public void RemoveStationLast() {
		 Station.removeLast();
		 System.out.println("Removed The Last Station");
	 }
}
