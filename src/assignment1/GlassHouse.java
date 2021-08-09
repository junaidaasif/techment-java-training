package assignment1;

import java.util.Scanner;
public class GlassHouse {
	
	public static void main(String agrs[]) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two digit num");
		int input = scan.nextInt();
		if(input>9 && input<100) {
		
		while(input>0) {
			int lastDigit = input%10;
			sum = sum + lastDigit;
			input = input/10;
		}
		
		System.out.println(sum);
		}
		else {
			System.out.println("please enter two digit number!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
