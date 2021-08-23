package assignment2.Collection.program1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class abc{
	int date = 0;
	int counter = 0;
	String a = "Junaid";
	String b = "Junaid";
	
	public String generatePNR() {
		return  a.charAt(0) + b.charAt(0) + "_" + date + "_" + counter;
	}
}
public class StudentMarks {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		ArrayList<Integer> marks = new ArrayList<Integer> ();
		System.out.println("Enter how many marks did you want to enter");
		Scanner scan = new Scanner(System.in);
		int numberStudents = scan.nextInt();
		
		for(int i=0; i<numberStudents; i++) {
			int input = scan.nextInt();
			marks.add(input);
			sum += input;
		}
		
		Collections.max(marks);
		int avg = sum/numberStudents;
		Collections.sort(marks);
		System.out.println("Highest marks :" + Collections.max(marks));
		System.out.println("Average marks :" + avg);
		System.out.println("Marks are : " + marks);

//		System.out.println(a.charAt(0));
		System.out.println("The marks of 3 student is :"+ marks.get(2));
		System.out.println(marks);
		
	}
	
	


}
