package techmentTrainingDay1;

import java.util.Scanner;
public class OddEven {
	
	public static void main(String args[]) {
		System.out.println("please enter today's date");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input%2==0) {
			System.out.println("Cars with Even registration numbers are permitted today");
		}
		else if(input!=0) {
			System.out.println(" Cars with Odd registration numbers are permitted today");
		}
		else {
			System.out.println("Wrong input");
		}
	}
}
