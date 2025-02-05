package Inheritance_2;

public class Current extends Bank_Account {

	void Withdraw(double balance,double withdraw) {
		if(balance>=10000) {
			System.out.println("Withdraw sucessfull..");
			System.out.println("The Current balance is "+(balance-withdraw));

		}
		else {
			System.out.println("Insufficient Balance....");
		}
	}
}
