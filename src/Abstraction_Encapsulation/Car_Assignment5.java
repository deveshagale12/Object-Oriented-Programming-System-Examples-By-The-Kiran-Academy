package Abstraction_Encapsulation;

public class Car_Assignment5 {
	
	int speed;
	int fuelLevel;
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	void increase(int speed) {
		if(speed>=80) {
			System.out.println("The Speed is Exceed its Limit.....");
		}
	}
	
	void decrease(int speed) {
		if(speed<=80) {
			System.out.println("The Speed is Limited.....");
		}
	}

}
