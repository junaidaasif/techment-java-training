package oopsAssignment;

import java.util.Scanner;

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
}

class EngineeringBook extends Book{
	private String category;

	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}

	
}

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int bookNo = scan.nextInt();
		String title = scan.nextLine();
		String author= scan.nextLine();
		float price = scan.nextFloat();
		String category = scan.next();
		Book book = new Book(bookNo, title, author, price);
		EngineeringBook engineeringBook = new EngineeringBook(bookNo, title, author, price, category);
	}

}
