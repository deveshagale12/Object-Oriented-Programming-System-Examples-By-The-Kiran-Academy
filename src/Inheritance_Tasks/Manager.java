package Inheritance_Tasks;

public class Manager extends Employee {
	void manager_details(String name,double salary,int id, int teamsize) {
		System.out.println("The Manager Name is "+name);
		System.out.println("The Manager id is "+id);
		System.out.println("The Salary of Manager is "+salary);
		System.out.println("The Team Size is "+teamsize);
	}

}
