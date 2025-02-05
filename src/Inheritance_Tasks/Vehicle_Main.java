package Inheritance_Tasks;

public class Vehicle_Main {

	public static void main(String[] args) {
		Car c=new Car();
		c.details_Vehicle("BMW", 300);
		c.details_Car(c.Brand, c.speed, 4);
		System.out.println("==============================================");
		Bike b=new Bike();
		b.details_Vehicle("Kawasaki Ninja...", 450);
		b.details_Bike(b.Brand, b.speed, 6);
		System.out.println("==============================================");
		
	}

}
