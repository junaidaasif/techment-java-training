package assignment1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("enter to check");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = num;
		while(num>0) {
			int lastDigit = num%10;
			sum = sum + (lastDigit*lastDigit*lastDigit);
			num = num/10;
		}
		if(num==num2) {
			System.out.println("it is armstong num");
		}
		else {
			System.out.println("not");
		}
	}

}
