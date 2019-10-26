package BankingApplication;
import java.util.Scanner;

public class BankingApplicaiton {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("**********************************************************************");
		System.out.println("                           WELCOME");
		System.out.println("**********************************************************************");
		System.out.println("Enter your name and ID");
		BankAccount b = new BankAccount(sc.nextLine() , sc.nextLine());
		b.showMenu();
	}

}

class BankAccount {
	float balance;
	float previousTransaction;
	String custName;
	String custID;
	
	public BankAccount (String name , String ID) {
		this.custName = name;
		this.custID = ID;
	}
	
	void deposit (float amount) {
		if(amount > 0) {
			balance += amount;
			previousTransaction = -amount;
			
		}
	}
	
	void withdraw(float amount) {
		if(amount > 0) {
			balance -= amount;
			previousTransaction = amount;
		}
	}
	
	void getPrevTrans() {
		if(previousTransaction >0 ) {
			System.out.println("Deposited : " + previousTransaction );
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn : " + (-previousTransaction ));
		}
		else {
			System.out.println("No Transaction occured.");
		}
	}
	
	void showMenu() {
		String options = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome " + custName);
		System.out.println("Your ID is " + custID);
		
		do {
			
			System.out.println("\nA. CheckBalance\nB. Deposit\nC. Withdraw\nD. Previos Transation\nE. Exit \n");
			
			System.out.print("Enter an option : ");
			
			options = sc.nextLine();
			
			System.out.println();
			
			switch(options) {
			case "A" : System.out.println("Balance : " + balance + "\n");
		            	
						break;
			case "B" : { System.out.print("Enter amount to deposit : ");
						float amount = sc.nextFloat();  
			            deposit(amount);
			            System.out.println();
			            options = sc.nextLine();
			            break;
						}
			case "C" : System.out.print("Enter amount to Withdraw : " );
			            float amount = sc.nextFloat();  
			            withdraw(amount);
			            System.out.println();
			            options = sc.nextLine();
			            break;
			            
			case "D" : System.out.println();
						getPrevTrans();
						System.out.println();
						options = sc.nextLine();
						break;
			case "E" : break;
			
			default :  System.out.println("Invalid key. Enter again. \n");
			}
		}while(!options.equalsIgnoreCase("E"));
		
		System.out.println("\nThankyou for using our services. Come again. :) \n");

		System.out.println("*********************************************************************************");
	}
}
