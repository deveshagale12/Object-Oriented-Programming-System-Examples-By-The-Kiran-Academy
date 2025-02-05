package Inheritance_Tasks;

public class Students extends Person{

	void students_details(int st_id,char grade,String name,int age, String address,double fees) {
		System.out.println("The Id of Student is "+st_id);
		System.out.println("The Name of a Student is "+name);
		System.out.println("The Age of a Students is "+age);
		System.out.println("The Grade of Students "+grade);
		System.out.println("The Address of a Students "+address);
		
		if(age>=12) {
			
			System.out.println("The Student get 30% off...");
			System.out.println("Your remaining Fees is after 30% off "+(fees-(fees*30/100)));
		}
		else {
			System.out.println("The Students get 50% off ...");
			System.out.println("Your remaining Fees is after 50% off "+(fees-(fees*50/100)));
		}
	}
}
