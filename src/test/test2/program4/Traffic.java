package test.test2.program4;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for red light 2 for green light 3 for yellow light");
		int input = scan.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("Stop");
			break;
			
		case 2:
			System.out.println("Green");
			break;
			
		case 3:
			System.out.println("Ready");
			break;


		}
		
	}
	

}
