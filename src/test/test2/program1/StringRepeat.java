package test.test2.program1;

import java.util.Scanner;
class Repeated{
	public String repeatFront(String str, int n) {
		String str2 = str.substring(0, n);
		while(n!=0) {
			str2 += str.substring(0, n-1);
			n--;
		}
		return str2;
	}
}

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = scan.nextInt();
		
		Repeated repeated = new Repeated();
		System.out.println("Enter the string and num to repeat");
		System.out.println(repeated.repeatFront(str, n));
	}

}
