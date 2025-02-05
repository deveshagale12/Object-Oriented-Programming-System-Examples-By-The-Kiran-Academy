package Abstraction_Encapsulation;

public class Triangle implements Shape{
	
	int b;
	int h;
	
	public Triangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	@Override
	public void calculateArea() {	
		System.out.println("The Area of Triangle is "+((b*h)/2));	
	}

}
