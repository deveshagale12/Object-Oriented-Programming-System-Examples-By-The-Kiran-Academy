package Abstraction_Encapsulation;

public class BankAccount {
	double accountNumber;
	double balance;
	double deposit;
	double withdraw;
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit+balance;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
		
		if(deposit>=0) {
			balance=balance+deposit;
			System.out.println("The Deposit successfully : "+balance);
			
		}
		else {
			System.out.println("Invalid Input....");
		}

	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
		
		if(balance>=withdraw) {
			balance=balance-withdraw;
			System.out.println("The withdraw successfully : "+balance);
			
		}
		else {
			System.out.println("Invalid Input....");
		}

	}
	
	


}
