package assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			
		}
		
		for (int i = 0; i < num; i++)   
        {  
            for (int j = i + 1; j < num; j++)   
            {  
                if (Quantity[i] > Quantity[j])   
                {  
                    int temp = Quantity[i];  
                    Quantity[i] = Quantity[j];  
                    Quantity[j] = temp;  
                }  
            }  
        }  
		System.out.println("highest Quantity "+ Quantity[num-1]);
		
		
	
	}

}
