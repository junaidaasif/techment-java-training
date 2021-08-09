package assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class TotalStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Quantity");
		int num = scan.nextInt();
		int Quantity[] = new int[num];
		System.out.println("enter the quantity");
		for(int i=0; i<num; i++) {
			Quantity[i] = scan.nextInt();
			
		}
		
		for(int i=0; i<num; i++) {

			System.out.println("product quantity are" + Quantity[i]);
			sum +=Quantity[i];
			
		}
		
		System.out.println(sum);
		
		
	
	}

}
