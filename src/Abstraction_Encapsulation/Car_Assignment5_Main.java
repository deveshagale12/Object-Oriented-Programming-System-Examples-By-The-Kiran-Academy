package Abstraction_Encapsulation;

public class Car_Assignment5_Main {

	public static void main(String[] args) {
		
		Car_Assignment5 c=new Car_Assignment5();
		c.setSpeed(78);
		int speed=c.getSpeed();
		System.out.println("The Speed of Car is "+speed);
		
		c.setFuelLevel(90);
		int fuel=c.getFuelLevel();
		System.out.println("The Fuel Level of Car is "+fuel+"%");
		
		c.increase(c.speed);
		c.decrease(c.speed);

	}

}
