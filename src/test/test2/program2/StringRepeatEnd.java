package test.test2.program2;


import java.util.Scanner;
class Repeated{
	public String repeatFront(String str, int n) {
		int count = n;
		String str2 = str.substring(str.length()-n, str.length());
		
		while(count>1) {
			str2 += str.substring(str.length()-n, str.length());
			count--;
		}
		return str2;
	}
}

public class StringRepeatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = scan.nextInt();
		
		Repeated repeated = new Repeated();
		
		System.out.println(repeated.repeatFront(str, n));
	}

}
