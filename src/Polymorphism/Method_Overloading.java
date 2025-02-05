package Polymorphism;

public class Method_Overloading {
	void dish(String name) {
		System.out.println(name+" Order Sucessfully..");
	}
	
	void dish(String name, double quantity) {
		System.out.println(name+" Dish is Order " +quantity +" is Quantity");
	}
	
	void dish(String name, double quantity, String spicy) {
		System.out.println(name+" Dish is Order " +quantity +" is Quantity "+spicy);
	}


	public static void main(String[] args) {

		Method_Overloading m=new Method_Overloading();
		m.dish("Palak Panner");
		m.dish("Rice", 5);
		m.dish("Soup", 7,"Spicy More Added in Soup");

	}

}
