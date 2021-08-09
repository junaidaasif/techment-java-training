package assignment1;


import java.util.Scanner;
import java.util.Random;
public class DiceGame_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxRange;

	       
	        Scanner SC = new Scanner(System.in);
	        Random rand = new Random();
	        
	        System.out.print("Please enter maximum range: ");
	        maxRange= 6;
	        
	        
	           int a = rand.nextInt(maxRange);
	        int b = rand.nextInt(maxRange);
	        if(a%2==0 && b%2==0) {
	        	int c = a+b;
	        	System.out.println("both nom are even hence there add is" +  c);
	        }
	        else {
	        	int c = a-b;
	        	System.out.println("both are not random hence there sub is" + c);
	        }
	        
	        
	}

}
