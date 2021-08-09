package ArrayAssignment;

import java.util.Scanner;
class Number{
	void sort(int arr[], int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
		            arr[i] = temp;
				}
			}
		}
		
	       System.out.println("the largest two number in an array is " +arr[n-1] +" "+ arr[n-2]);
	       System.out.println("the Smallest two number in an array is " +arr[0] +" "+ arr[1]);
		    
	}
}

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = scan.nextInt();
		int input[] = new int[num];
		for(int i=0; i<num; i++) {
			input[i] = scan.nextInt();
		}
		
		Number sorting = new Number();
		sorting.sort(input, num);
	}
	

}
