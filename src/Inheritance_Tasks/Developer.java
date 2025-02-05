package Inheritance_Tasks;

public class Developer extends Employee{
	
	void developer_details(String name,int id,double salary, String Programming_language) {
		System.out.println("The Developer Name is "+name);
		System.out.println("The Developer id is "+id);
		System.out.println("The Salary of Developer is "+salary);
		System.out.println("The Programming Language the developer used is "+Programming_language);
	}
}
