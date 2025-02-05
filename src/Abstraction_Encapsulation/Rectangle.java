package Abstraction_Encapsulation;

public class Rectangle implements Shape{
	int l;
	int b;
	
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
		
	}

	@Override
	public void calculateArea() {
	
		System.out.println("The Area of Rectangle is "+(l*b));
		
		
	}
	
}
