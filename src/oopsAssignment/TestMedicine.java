package oopsAssignment;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine{
	private int price;
	private String expiryDate;
	
	public Medicine(int price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	void getdetails() {
		System.out.println("price : " + this.price + "\n" + "Expiry date : " + this.expiryDate);
	}
	abstract void displayLabel();
}

class Tablet extends Medicine{
	public Tablet(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	void displayLabel(){
		System.out.println("Store in the cool dry place");
	}
}
 
class Syrup extends Medicine{
	public Syrup(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	void displayLabel(){
		System.out.println("For external use only");
	}
}

class Ointment extends Medicine{
	public Ointment(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	void displayLabel(){
		System.out.println("for 13+ only");
	}
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine medicine[] = new Medicine [5];
		medicine[0] = new Tablet(1000, "1/2/2021");
		medicine[1] = new Syrup(2000, "15/3/2021");
		medicine[2] = new Ointment(4500, "7/5/2021");
		medicine[3] = new Tablet(9000, "17/6/2021");
		medicine[4] = new Syrup(5000, "5/7/2021");
		
		 int maxRange;
	        Random random = new Random();
	        int n = random.nextInt(3);
	    
	        medicine[n].displayLabel();
	        medicine[n].getdetails();
	    
	}

}
