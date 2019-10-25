package StudentDatabaseSystem;
import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentid;
	private String courses = null ;
	private int tuitionBalance = 600;
	private static int costOfCourse = 0 ;
	private static int id = 1001;
	 
	// constructor : prompt user to enter student's name and year 
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter studnet First name : ");
		this.firstname = in.nextLine();
		
		System.out.println("Enter studnet Last name : ");
		this.lastname = in.nextLine();
		
		System.out.println("\n1. Freshman\n2. Sophamore\n3. Junior\n4. Senior\nEnter studnet level : ");
		this.gradeyear = in.nextInt();
		
		setStudentID();
		
		
		
	}
	
	// generate an id 
	private void setStudentID() {
		// gradelevel + id 
		this.studentid = gradeyear + "" +id;
		id++;
		
	}
	
	// enroll in courses 
	public void enroll() {
		// get inside a loop , user hits Q
		System.out.println();
		
		do {
			System.out.print("Enter course to enroll (Q to quit)  ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if(!course.equalsIgnoreCase("Q")) {
				if(courses==null)courses = course ;
				else {
					courses = courses + " , " + course;
					tuitionBalance = tuitionBalance + costOfCourse ;
				}
			}
			else { break;}
		}while(1!=0);
		
	}
	
	
	
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is $ "+ tuitionBalance);
	}
	
	// pay tuition 
	public void payTuition() {
		viewBalance();
		System.out.print("\nEnter your payment :$");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -=payment;
		System.out.println("Thankyou for your payment of $"+payment);
		viewBalance();
	}
	
	// show status 
	public String showInfo() {
		return "\nName : " + firstname + " "+ lastname +
				"\nGrade level : "+ gradeyear +
				"\nStudent ID : "+studentid +
				"\nCourses Enrolled : "+ courses +
				"\nBalance : "+ tuitionBalance ;
	}
	

}
