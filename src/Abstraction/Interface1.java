package Abstraction;

public interface Interface1 {
	
	void display();
	static void method1() {
		System.out.println("This is static methods...");
	}
	
	default void method2() {
		System.out.println("This is Default methods...");

	}

}
