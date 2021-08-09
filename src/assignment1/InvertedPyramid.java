package assignment1;

import java.util.Scanner;
public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i,j; 
		Scanner scan  = new Scanner(System.in);
		number = scan.nextInt();
	    for(i = number; i >= 1; i--)
	    {
	          
	        // Inner loop print space
	        for(j = i; j < number; j++)
	        {
	            System.out.print("  ");
	        }
	          
	        // Inner loop print star
	        for(j = 1; j <= i; j++)
	        {
	            System.out.print(j+" ");
	        }
	        
	        for(j = i-1; j >=1; j--)
	        {
	            System.out.print(j+" ");
	        }
	          
	          
	        // Ending line after each row
	        System.out.println("");
	    } 

		  

	}
}