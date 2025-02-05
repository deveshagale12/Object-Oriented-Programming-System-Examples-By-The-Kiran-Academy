package Inheritance_Tasks;

public class EDbook extends Book{
	
	void eBook(String title,String Author, double price, int fileSize, String format) {
		System.out.println("The Details of E-Book are .......");
		System.out.println("The title of Book is "+title);
		System.out.println("The Author Name of Book is "+Author);
		System.out.println("The Price of Book is "+price);
		System.out.println("The File Size of Book is "+fileSize);
		System.out.println("The Format of Book is "+format);
	}

}
