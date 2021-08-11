package test1;

import java.util.Scanner;
public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter how many age you want to take input");
		int limit = scan.nextInt();
		int childCount = 0, adultCount =0, seniorCount = 0 ;
		int person[] = new int[limit];
		
		for(int i=0; i<limit; i++) {
			person[i] = scan.nextInt();
			if(person[i] < 18)
				childCount++;
			else if(person[i]>=18 && person[i]<=55) {
				adultCount++;
			}
			else
				seniorCount++;
		}
		System.out.println("Children " + childCount);
		System.out.println("Adult " + adultCount);
		System.out.println("Senior " + seniorCount);
	}

}
