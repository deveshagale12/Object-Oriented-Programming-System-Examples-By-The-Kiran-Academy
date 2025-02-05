package Abstraction;

public class Demo_Main {

	public static void main(String[] args) {

		DemoImpl demo=new DemoImpl();
		demo.operationSum(4, 8);
		demo.operationSub(7, 9);
		
		String sc=Demo.printMessage("Hello Static Method ....");
		System.out.println(sc);
		
		demo.message();
	}

}
