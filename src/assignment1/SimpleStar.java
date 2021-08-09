package assignment1;

import java.util.Scanner;
public class SimpleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		for(int i=1; i<=limit; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
