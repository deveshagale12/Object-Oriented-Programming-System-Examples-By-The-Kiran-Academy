package Encapsulation;

public class Students_Main_Get_Set {

	public static void main(String[] args) {

		Students_Get_Set s=new Students_Get_Set();
		s.setName("Devesh");
		s.setAddress("Bhagadi");
		s.setId(90);
		s.setRollNo(56);
		
		System.out.println("Name: "+s.getName()+" Id: "+s.getId()+" Address: "+s.getAddress()+" RollNo"+s.getRollNo());
		
	}

}
