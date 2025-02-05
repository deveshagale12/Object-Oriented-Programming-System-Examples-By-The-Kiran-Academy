package Inheritance_Tasks;

public class School_Management_System {

	public static void main(String[] args) {
		
		Students st=new Students();
		st.details_Person("Devesh", 6, "Pune");
		st.students_details(56, 'A', st.name, st.age, st.address, 100);
		System.out.println("============================================================");
		Students st1=new Students();
		st1.details_Person("Shreyash", 20, "Manchar");
		st1.students_details(98, 'A', st1.name, st1.age, st1.address, 1000);
		
		System.out.println("============================================================");
		
		Teacher t=new Teacher();
		t.details_Person("Tejas", 40, "Alephata");
		t.teacher_details(78, t.name, t.age, t.address, "Math");
		System.out.println("============================================================");
	}

}
