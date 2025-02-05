package Bank_Account_Management_System;

import java.util.Scanner;

public class Bank_Account_Management_System_Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		Bank_Details b=new Bank_Details();

		do {
			
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Show Balance");
			System.out.println("5. Exit");
			

			System.out.println("Enter your Choice : ");
			int ch=sc.nextInt(); 
			
			switch(ch) {
			
			case 1:b.accountCreate(b.accNumber);break;
			case 2:System.out.println("Enter the Deposit Ammount : ");
					double deposit=sc.nextDouble();
					b.deposit_Money(deposit);break;
			case 3:System.out.println("Enter Money to be Withdraw : ");
					double w=sc.nextDouble();
					b.withdraw_Money(w);break;
					
			case 4: b.balance();break;
			
			case 5:System.exit(0);
			
			default: System.out.println("Invalid Choice=");
		}
						
		}while(true);
		
	}

}
