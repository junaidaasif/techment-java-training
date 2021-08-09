package assignment1;

import java.util.Scanner;

public class PatternProg36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int number = scanner.nextInt();
		int temp = number;
		
		
		
		for(int i = number;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			
			for (int k = temp; k>=1;k--)
            {
                System.out.print(k+" ");
            }
			System.out.println();
			temp--;
			
			
		}
	}

}
