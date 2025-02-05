package Abstraction_Encapsulation;

public class Employee_Management_System 
	{
	int id;
	String name;
	double salary;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	void increaseSalary(double percentage) {
		double save=((salary*percentage)/100);
		System.out.println("The Salary of Employee after "+percentage+"% increase is "+(salary+save));
	}
	
	
}
