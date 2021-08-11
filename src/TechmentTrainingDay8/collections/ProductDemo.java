package TechmentTrainingDay8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}

class priceSorting implements Comparator<Product>{
	

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return 1;
		return -1;
	}
}

class QuantitySorting implements Comparator<Product>{
	

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price)
			return 0;
		else if(o1.price<o2.price)
			return 1;
		return -1;
	}
}




public class ProductDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Product> proList = new ArrayList<Product>();
		proList.add(new Product(1, "rice", 2300, 100));
		proList.add(new Product(2, "burger", 430,200));
		proList.add(new Product(3, "pizzw", 1300, 145));
		proList.add(new Product(4, "soda", 205, 1801));
		
		for(Product list : proList) {
			System.out.println(list.id + " "+ list.name + " " + list.price + " " + list.quantity);
		}
		
		System.out.println("=========after price sorting============");
		
		Collections.sort(proList, new priceSorting());
		
		for(Product list : proList) {
			System.out.println(list.id + " "+ list.name + " " + list.price + " " + list.quantity);
		}
		
		System.out.println("=========after quantity sorting============");
		
		Collections.sort(proList, new QuantitySorting());
		
		for(Product list : proList) {
			System.out.println(list.id + " "+ list.name + " " + list.price + " " + list.quantity);
		}
		
		System.out.println("=========more than 500 price============");
			for(Product list : proList) {
			if(list.price > 500) 
			System.out.println(list.id + " "+ list.name + " " + list.price + " " + list.quantity);
			
		}
	}

}
