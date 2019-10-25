package emailapp;

import java.util.Scanner;

public class email {
private String firstname;
private String lastname ;
private String password;
private String department ;
private String Email ;
private int defaultPasswordLength = 10;
private int mailboxCapacity =500;
private String alternateEmail;
private String companySuffix = "aeycompany.com";

//constructor to receive lastname and firstname 

public email(String firstname , String lastname ) {
	
	this.firstname = firstname;
	this.lastname = lastname;
	
	//call a method asking for a department and return a department
	this.department = setDepartment();
	System.out.println("Department is :"+ this.department);
	
	//calls a method that returns a random password 
	
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your Password is : "+ this.password);
	
	//complete elements to generate email 
	Email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department +"."+ companySuffix ;
	System.out.println("Your Email is "+ Email);
	
}
	
	private String setDepartment() {
		System.out.println("New Employee : " + firstname + " " + lastname +"\nDepartment codes:-\n1. For sales\n2. For Devolpment\n3. For Accoutning\n0. For none\nEnter the department ");
		
		Scanner in = new Scanner(System.in);
		int department = in.nextInt();
		if(department == 1) {
			return "sales";
		}
		else if (department == 2)return "dev";
		else if (department == 3)return "acct";
		else return "";
	}
	
	//generate a random password 
	private String randomPassword (int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char password[] = new char[length];
		for(int i=0 ; i<length ;i++) {
			int rand = (int) (Math.random() * passwordSet.length()) ;
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// set the mailbox capacity 
	public void SetMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity ;
	}
	
	// set alternate email
	public void setAlternateEmail ( String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the password 
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity ;}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
		
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name : " + firstname + " " + lastname + "\nCompany Email : " +Email + "\nMailbox Capacity : " + mailboxCapacity 
				+ "mb" ;
	}

}
