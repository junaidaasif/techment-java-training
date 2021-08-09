package assignment1;

import java.util.Scanner;
public class PallindromicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row; 
		Scanner scan  = new Scanner(System.in);
		row = scan.nextInt();
		
		  for(int i = 1; i <= row; i++){
		        for(int j = 1; j <= row-i; j++){
		        	System.out.print("  ");
		        }

		        for(int k = i; k >= 1; k--){
		           System.out.print(k +" ");
		        }
		        for(int k = 2; k<=i; k++){
		        	 System.out.print(k +" ");
		        } 
		        System.out.println();
		  }
		  

	}
}