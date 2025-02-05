package Inheritance_Tasks;

public class Main_Employee {

	public static void main(String[] args) {
		Manager m=new Manager();
		Manager m1=new Manager();
		
		m.details_employee("Devesh", 890, 789000);
		m.manager_details(m.name, m.salary, m.id, 6);
		System.out.println("===================================================");
		m1.details_employee("Nikhil", 780, 50000);
		m1.manager_details(m1.name, m1.salary, m1.id, 6);
		System.out.println("===================================================");
		
		Developer d=new Developer();
		Developer d1=new Developer();
		d.details_employee("Harish", 880, 89000);
		d.developer_details(d.name, d.id, d.salary, "Java");
		System.out.println("===================================================");
		d1.details_employee("Chetan", 120, 76097);
		d1.developer_details(d1.name, d1.id, d1.salary, "Python");

		
	}

}
