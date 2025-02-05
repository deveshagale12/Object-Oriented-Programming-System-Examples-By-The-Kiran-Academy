package Encapsulation;

public class Employee_Constructor {

	String eName;
	int id;
	String Location;
	
	public Employee_Constructor(String eName, int id, String location) {
		this.eName = eName;
		this.id = id;
		this.Location = location;
	}

	@Override
	public String toString() {
		return "Employee--> Name=" + eName + ", Id=" + id + ", Location=" + Location ;
	}
	
	
	
}
