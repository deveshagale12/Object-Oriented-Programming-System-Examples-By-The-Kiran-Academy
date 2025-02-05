package Abstraction_Encapsulation;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is Starting......");
		
	}

	@Override
	public void stop() {

		System.out.println("Car is Stoping......");
		
	}

	@Override
	public void accelerate() {


		System.out.println("Car is Accelerating......");
		
	}

}
