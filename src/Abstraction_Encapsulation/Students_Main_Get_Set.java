package Abstraction_Encapsulation;

public class Students_Main_Get_Set {

	public static void main(String[] args) {

		Students_Get_Set s=new Students_Get_Set();
		s.setName("Devesh");
		s.setAge(45);
		s.setGrade('A');
		
		System.out.println("Name: "+s.getName()+" Age: "+s.getAge()+" Grade:"+s.getGrade());
		
	}

}
