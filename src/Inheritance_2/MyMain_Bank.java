package Inheritance_2;

public class MyMain_Bank {

	public static void main(String[] args) {
		Saving sa=new Saving();
		sa.bank_Balance("Devesh",30000);
		sa.saving_Interest(sa.balance);
		
		Current ca=new Current();
		ca.Withdraw(sa.balance, 10000);
	}

}
