package Inheritance_2;

public class Bank_Account {

	String name;
	double balance;
	void bank_Balance(String name,double amount) {
		balance=balance+amount;
		System.out.println("The Account Holder Name : "+name);
		System.out.println("The Bank Balance is "+balance);
	}
}
