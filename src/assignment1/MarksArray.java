package assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class MarksArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int min,max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many marks do you want to enter");
		int num = scan.nextInt();
		int marks[] = new int[num];
		System.out.println("enter the marks");
		for(int i=0; i<num; i++) {
			marks[i] = scan.nextInt();
		}
		
		for(int i=0; i<num; i++) {

			System.out.println("marks of the "+ i +"student is "+ marks[i]);
			sum += marks[i]	;
		}
		System.out.println("Sum of all student marks " + sum);
		
		
		for (int i = 0; i < num; i++)   
        {  
            for (int j = i + 1; j < num; j++)   
            {  
                if (marks[i] > marks[j])   
                {  
                    int temp = marks[i];  
                    marks[i] = marks[j];  
                    marks[j] = temp;  
                }  
            }  
        }  
		System.out.println("highest lowest "+ marks[0] + "highest "+ marks[num-1]);
		System.out.println("second highest marks is "+ marks[num -2]);
		
		if(sum>40) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
