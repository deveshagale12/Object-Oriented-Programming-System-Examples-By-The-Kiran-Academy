package Abstraction_Encapsulation;

import java.security.PrivateKey;

public class Employee_Management_System_Main {

	public static void main(String[] args) {

		Employee_Management_System e=new Employee_Management_System();
		e.setId(87);
		int id = e.getId();
		System.out.println("The Id of Employee : "+id);
		
		e.setName("Devesh");
		String name=e.getName();
		System.out.println("The Name of Employeee is "+name);
		
		e.setSalary(70000);
		double salary=e.getSalary();
		System.out.println("The Salary of Employee is "+salary);
		
		e.increaseSalary(7);
		
	}

}
