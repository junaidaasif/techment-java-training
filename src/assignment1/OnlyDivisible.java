package assignment1;

import java.util.Scanner;
public class OnlyDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int divisible = scan.nextInt();
		
		if(divisible%8==0 && divisible%3==0) {
			System.out.println("yes it is");
		}
		else {
			System.out.println("not");
		}
	}

}
