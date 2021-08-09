package assignment1;

import java.util.Scanner;
public class Weight {

	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of hrose one");
		int a = scan.nextInt();
		
		System.out.println("Enter the weight of hrose two");
		int b = scan.nextInt();
		
		System.out.println("Enter the weight of hrose three");
		int c = scan.nextInt();
		
		if(a>b){
		     if(a>c){
		 System.out.println("horse 1 most weighted");
		 }
		 else{
			 System.out.println("horse 3 most weighted");
		 }
		 }
		 else{
		 if(b>c){
			 System.out.println("horse 2 most weighted");
		 }
		 else{
			 System.out.println("horse 3 most weighted");
		 }
		 }
	}
}
