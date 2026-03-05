package cdac;

public class Date {
	String day;
	String date;
	
	Date(String day, String date ){
		this.day = day;
		this.date = date;
		this.IssueDateDetails();
	}
	
	public void IssueDateDetails() {
		System.out.println( day + " " + date );
	}
}
