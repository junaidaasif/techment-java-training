package arrayAssignment;

import java.util.Scanner;
class Sorted{
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
		for(int i=0; i<n; i++){
	       System.out.println(arr[i]);
	    }
	}
}

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = scan.nextInt();
		int input[] = new int[num];
		for(int i=0; i<num; i++) {
			input[i] = scan.nextInt();
		}
		
		Sorted sorting = new Sorted();
		sorting.sort(input, num);
	}
	

}
