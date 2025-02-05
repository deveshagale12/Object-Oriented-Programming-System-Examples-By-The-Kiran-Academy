package Abstraction_Encapsulation;

public class Payment_Main {

	public static void main(String[] args) {

		CreditCardPayment c=new CreditCardPayment();
		DebitCardPayment d= new DebitCardPayment();
		UPIPayment u=new UPIPayment();
		
		c.processPayment();
		d.processPayment();
		u.processPayment();
	}

}
