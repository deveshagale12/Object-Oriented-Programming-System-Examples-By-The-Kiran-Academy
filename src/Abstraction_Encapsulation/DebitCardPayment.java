package Abstraction_Encapsulation;

public class DebitCardPayment implements Payment{

	@Override
	public void processPayment() {

		System.out.println("This is Debit Card Session....");
	}

}
