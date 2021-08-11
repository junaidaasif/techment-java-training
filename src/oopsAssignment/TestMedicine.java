package oopsAssignment;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine{
	private int price;
	private int expiryDate;
	
	
	
	public Medicine(int price, int expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	void getdetails(int price, int expiryDate) {
		System.out.println();
	}
	abstract void displayLabel();
}

class Tablet extends Medicine{
	
	

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	void displayLabel(){
		System.out.println("Store in the cool dry place");
	}
}
 
class Syrup extends Medicine{
	void displayLabel(){
		System.out.println("For external use only");
	}
}

class Ointment extends Medicine{
	void displayLabel(){
		System.out.println("for 13+ only");
	}
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine medicine[] = new Medicine [5];
		medicine[0] = new tablet(1000, "1/2/2021");
		medicine[1] = new tablet(1000, "1/2/2021");
		medicine[2] = new tablet(1000, "1/2/2021");
		medicine[3] = new tablet(1000, "1/2/2021");
		medicine[4] = new tablet(1000, "1/2/2021");
		
		 int maxRange;
	        Random rand = new Random();
	     
	        maxRange= 3;
	        
	        
	    int a = rand.nextInt(maxRange);
	    
	    if(a==1) {
	    	
	    	Medicine tablet = new Tablet();
	    	tablet.displayLabel();
	    }
	    else if(a==2) {
	    	Medicine syrup = new Syrup();
	    	syrup.displayLabel();
	    	
	    }
	    else if(a==3) {
	    	
	    	Medicine ointment = new Ointment();
	    	ointment.displayLabel();
	    }
	}

}
