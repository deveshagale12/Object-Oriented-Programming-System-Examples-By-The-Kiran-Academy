package Abstraction_Encapsulation;

public class Shape_Main {

	public static void main(String[] args) {
		
		Circle c=new Circle(9);
		c.calculateArea();

			
		Triangle t=new Triangle(7, 5);
		t.calculateArea();
		
		Rectangle r=new Rectangle(7,8);
		r.calculateArea();
	}

}
