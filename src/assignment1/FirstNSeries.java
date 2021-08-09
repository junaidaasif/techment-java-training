package assignment1;

import java.util.Scanner;
public class FirstNSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter No. upto which you want to print");
		Scanner scan = new Scanner(System.in);
		int series = scan.nextInt();
		
		for(int i=1; i<=series; i++) {
			System.out.print(i*i*i+", ");
		}
	}

}
