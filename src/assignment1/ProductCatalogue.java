package assignment1;

import java.util.Scanner;

class Product{
	 int id;
	private String name;
	private int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void display(){
		System.out.println("id is "+ id);
		System.out.println("name is "+ name);
		System.out.println("price is "+ price);
	}
	
	void search(int num) {
		
	}
}

public class ProductCatalogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int num = scan.nextInt();
		
		Product[] product;
		product = new Product[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("enter id");
			int id = scan.nextInt();
			System.out.println("enter name");
			String name = scan.next();
			System.out.println("enter price");
			int price = scan.nextInt();
		
			product[i] = new Product(id, name, price);
		}
		System.out.println("enter for search");
		int search = scan.nextInt();
		for(int i=0; i<num; i++) {
			if(product[i].id== search)
			product[i].display();
		}
		
	}

}
