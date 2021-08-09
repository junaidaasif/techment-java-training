package assignment1;

import java.util.Scanner;
public class Birth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your bday month");
		int a = scan.nextInt();
		String [] month = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sept", "oct", "nov", "dec"};
		
		System.out.println(month[a-1]);
		
	}
}
