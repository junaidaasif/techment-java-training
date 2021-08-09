package assignment1;

import java.util.Scanner;
public class AnotherPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count=0;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				count+=1;
				System.out.print(count);
				
			}
			System.out.println();
			 
		}
	}

}
