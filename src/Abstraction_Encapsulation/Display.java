package Abstraction_Encapsulation;

public class Display implements Printable,Showable{

	@Override
	public void show() {

		System.out.println("This is Showable Method in Interface Printable.......");
		
	}

	@Override
	public void print() {

		System.out.println("This is Printable Method in Interface Printable........");
		
	}

}
