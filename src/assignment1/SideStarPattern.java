package assignment1;

import java.util.Scanner;
public class SideStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		}
	}

}
