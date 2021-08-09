package assignment1;

import java.util.Scanner;
public class LeapYear {
	
	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter to check the year is leap or not");
		int a = scan.nextInt();
		
		if(a%4==0) {
			if(a%100==0) {
				if(a%400==0) {
					System.out.println("it is a leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("it is a leap year");
			}
	}
		else {
			System.out.println("Not a leap year");
		}
	}
}
