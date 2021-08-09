package assignment1;

import java.util.Scanner;
public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter for series");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int [] series = new int [num];
		for(int i=1; i<=num; i++) {
			System.out.println(i*i*i);
		}
	}

}
