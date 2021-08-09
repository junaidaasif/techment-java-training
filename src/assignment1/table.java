package assignment1;

import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("upto");
		int limit =scan.nextInt();
		
		
		for(int i=1; i<=limit; i++) {
			System.out.println(num +"*"+i+"="+num*i);
		}
		
	}

}
