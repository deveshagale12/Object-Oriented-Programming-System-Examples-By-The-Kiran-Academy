package Abstraction;

public class DemoImpl extends Demo{

	@Override
	void show() {
			System.out.println("The Show Method is called using abstract.....");	
	}

	@Override
	void operationSum(int a, int b) {
			System.out.println("The Addition of Two Number is "+(a+b));
	}

	@Override
	void operationSub(int a, int b) {
		System.out.println("The Substraction of Two Number is "+(a-b));

	}

}
