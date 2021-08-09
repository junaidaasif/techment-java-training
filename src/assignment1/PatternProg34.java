package assignment1;

import java.util.Scanner;

public class PatternProg34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int number = scanner.nextInt();
		
				
		for(int i = 1;i<=number;i++) 
		{
			for(int j = number;j>=i;j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
