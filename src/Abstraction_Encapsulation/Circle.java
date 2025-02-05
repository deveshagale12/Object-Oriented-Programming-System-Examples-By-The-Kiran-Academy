package Abstraction_Encapsulation;

public class Circle implements Shape{
	
	float pi=3.14f;
	int r;
	
	
	public Circle(int r) {
		this.r = r;
	}
	
	
	@Override
	public void calculateArea() {
		System.out.println("The Area of Circle is "+(pi*r*r));
		
		
	}

}
