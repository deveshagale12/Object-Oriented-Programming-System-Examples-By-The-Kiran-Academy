package Abstraction_Encapsulation;

public class BankAccount_Main {

	public static void main(String[] args) {

		BankAccount b=new BankAccount();
		b.setAccountNumber(261027635);
		double account=b.getAccountNumber();
		System.out.println("The Account Number is "+account);
		
		b.setBalance(200000);
		double balance=b.getBalance();
		System.out.println("The Balance in Acount is "+balance);
		
		b.setDeposit(60000);
		double deposit=b.getDeposit();
		
		b.setWithdraw(110000);
		double w=b.getWithdraw();
		
		
		
		
		

	}

}
