import java.time.*;
import java.util.Scanner;

public class Account {
	private String AccType;
	private String OwnerName;
	private String City;
	private String State;
	private int PIN;
	private double Balance;
	private LocalDate Date;
	private String Status;
	
	public void Account() {
		getDetails();
		
		System.out.println("Account created on: " + this.Date + "!");
		
	}
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Name: ");
		OwnerName = sc.nextLine();
		System.out.println("Please Enter your Account Type: ");
		AccType = sc.nextLine();
		System.out.println("Please Enter your City: ");
		City = sc.nextLine();
		System.out.println("Please Enter your State: ");
		State = sc.nextLine();
		System.out.println("Please Enter your PIN: ");
		PIN = sc.nextInt();
		System.out.println("Please Enter your Balance Amount: ");
		Balance = sc.nextDouble();
		
		this.Status = "ACTIVE";
		this.Date = LocalDate.now();
		
		
		
	}
	
	public void deposit(double amount) {
		Balance += amount;
		
		System.out.println("Amount ₹" + amount + "added successfully to your account!");
		
		showBal();
		
	}
	public void withdraw(double amount) {
		if(amount > Balance) {
			System.out.println("Sorry! Your account doesn't have sufficient balance");
		}
		else {
			Balance -= amount;
			System.out.println("₹" + amount + " has been successfully debited from your account");
			
			showBal();
		}
	}
	public void showBal() {
		System.out.println("Your Current Balance is: " + this.Balance);
		
	}

}
