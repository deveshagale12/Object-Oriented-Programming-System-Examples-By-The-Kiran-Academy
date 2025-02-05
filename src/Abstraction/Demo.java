package Abstraction;

public abstract class Demo {
	
	abstract void show();
	abstract void operationSum(int a,int b);
	abstract void operationSub(int a,int b);
	
	//Normal Concrete Method 
	void message() {
		System.out.println("Message() method is running....." );
	}
	
	//static
	
	static String printMessage(String message) {
		return message;
	}
	

}
