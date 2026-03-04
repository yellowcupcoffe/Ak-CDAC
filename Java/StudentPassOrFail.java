package Java;
import java.util.Scanner;


public class StudentPassOrFail {
	
	
	
	public static String TakeStudentName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Name please: ");
		String name = sc.nextLine();
		return name;
	}
	
	
	public static int TakeStudentMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter your Marks: ");
		int marks = sc.nextInt();
		return marks;
	}
	
	public static void Result(String name, int marks) {
		
		if(marks >= 40) {
			System.out.println("Congratulations!! " + name + " you have Passed the Exam!!!!");
		} else {
			System.out.println("I am relly sorry to announce it to you " + name + " but unfornuntely you have failed the exam");
		}
	}
	

	public static void main(String[] args) {
			
		String name =  TakeStudentName();
		int marks = TakeStudentMarks();
		Result(name, marks);
			
	}

}
