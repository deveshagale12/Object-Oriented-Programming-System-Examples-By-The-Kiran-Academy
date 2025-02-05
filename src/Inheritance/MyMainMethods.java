package Inheritance;

public class MyMainMethods {

	public static void main(String[] args) {
		ClassChild ch=new ClassChild();
		ch.display1();
		System.out.println("The Instance Variable of Child Class "+ch.num);
		ch.display2();
		System.out.println("The Instance Variable of Parent Class "+ch.num1);
		ch.display3();
		System.out.println("The Instance Variable of GrandParent Class "+ch.num2);
	}
}
