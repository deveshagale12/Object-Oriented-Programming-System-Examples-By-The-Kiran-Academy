package Inheritance_Tasks;

public class PrintedBook extends Book{
	void printedBook(String title,String Author, double price, int pageCount, String cover) {
		System.out.println("The title of Book is "+title);
		System.out.println("The Author Name of Book is "+Author);
		System.out.println("The Price of Book is "+price);
		System.out.println("The File Size of Book is "+pageCount);
		System.out.println("The Format of Book is "+cover);
	}


}
