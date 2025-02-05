package Abstraction_Encapsulation;

public class Vehicle_Main {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		c.accelerate();
		c.stop();
		System.out.println("=====================================================");
		Bike b=new Bike();
		b.start();
		b.accelerate();
		b.stop();
		
		

	}

}
