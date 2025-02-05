package Inheritance_Tasks;

public class Saving extends Bank_Account {
	double interest=4.0;
	
	
	void saving_Interest(double balance) {
		double save=((balance*interest)/100);
		System.out.println("The Saving Account balance is "+(balance+save));
	}

}
