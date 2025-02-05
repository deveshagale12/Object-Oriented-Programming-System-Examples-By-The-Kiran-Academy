package Abstraction_Encapsulation;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {

		System.out.println("This is Credit Card Session....");
	}

}
