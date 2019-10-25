package StudentDatabaseSystem;
import java.util.Scanner;
public class StudentDatabaseSystem {
	public static void main (String []args) {
		
		// ask how many new users we want to add
		System.out.print("Enter number of students to add : ");
		Scanner in = new Scanner(System.in);
		int numOfStud = in.nextInt();
		Student[] students = new Student[numOfStud];
		
		// create n number of new students
		for(int n=0 ; n<numOfStud ;n++) {
			System.out.println("\n\nStudent : "+(n+1));
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
		
	}

}
