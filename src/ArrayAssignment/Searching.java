package ArrayAssignment;

import java.util.Scanner;
class Search{
	int find(int arr[], int n, int a) {
		int flag = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] == a) {
			return i+1;
				  
			}
		}
		return -1;
		
		    
	}
}

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = scan.nextInt();
		
		System.out.println("Enter the number to search");
		int a = scan.nextInt();
		
		int input[] = new int[num];
		for(int i=0; i<num; i++) {
			input[i] = scan.nextInt();
		}
		
		Search searched = new Search();
		 if(searched.find(input, num, a)!= -1){
			 System.out.println("the num is find at" + searched.find(input, num, a));
			    }
			    else{
			    	System.out.println("not preset");
			    }
	}
	

}
