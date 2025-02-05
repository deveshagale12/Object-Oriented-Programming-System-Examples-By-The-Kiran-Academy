package Bank_Account_Management_System;

import java.util.Scanner;

public class Bank_Details {
	
	long accNumber;
	double deposit_money;
	double withdraw;
	double balance;
	
	Scanner sc=new Scanner(System.in);
	
	
	void accountCreate(long accNumber) {
		this.accNumber=accNumber;
	
		System.out.println("Enter the Id of Customer : ");
		int id=sc.nextInt();
		System.out.println("Enter the Name of a Customer : ");
		String name=sc.next();
		System.out.println("Enter the Address of a Customer : ");
		String address=sc.next();
		System.out.println("Enter the AdharCard Number of a Customer : ");
		double adharcardNo=sc.nextDouble();
		System.out.println("Enter the Account Number : ");
		this.accNumber=sc.nextLong();
		System.out.println("Account Created Successfully.......");
	}
	
	void deposit_Money(double deposit) {
		this.deposit_money=deposit;
		if(deposit>=0) {
			balance=balance+deposit;
			System.out.println("The Deposit successfully : "+balance);	
		}
		else {
			System.out.println("Invalid Input....");
		}
		System.out.println("Deposit Successfully.....");

	}
	
	void withdraw_Money(double withdraw) {
		this.withdraw=withdraw;
		if(balance>=withdraw) {
			balance=balance-withdraw;
			System.out.println("The withdraw successfully : "+balance);
			
		}
		else {
			System.out.println("Invalid Input....");
		}
		
		System.out.println("Withdraw Successfully.....");
	}
	
	void balance() {
		System.out.println("The Balance is remaining : "+balance);
	}
	
	

}
