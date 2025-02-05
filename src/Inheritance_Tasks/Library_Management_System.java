package Inheritance_Tasks;

public class Library_Management_System {

	public static void main(String[] args) {
		
			EDbook e=new EDbook();
			e.details_book("Ramayan", "Author1", 100000);
			e.eBook(e.title, e.Author, e.price, 7, "pdf");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			
			EDbook e1=new EDbook();
			e1.details_book("ShyamChi Aai", "Author3", 1000);
			e.eBook(e.title, e.Author, e.price, 7, "jpg");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			
			PrintedBook p=new PrintedBook();
			p.details_book("Mahabharat", "Author 2", 500000);
			p.printedBook(p.title, e.Author, e.price, 1000, "Mahabharat Image");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			
			
			

	}

}
