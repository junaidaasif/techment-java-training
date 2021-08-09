package ArrayAssignment;

import java.util.Scanner;
class ArrayMerge{
	void merger(int arr1[], int size1, int arr2[], int size2) {
		int newSize = size1+ size2;
		int arr3[] = new int[newSize];
		for(int i=0; i<size1; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0; i<size2; i++) {
			arr3[size1+i] = arr1[i];
		}
		
		for(int i=0; i<newSize; i++) {
			System.out.println(arr3[i] + "this");
		}
		
	}
}

public class Merge{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size1 = scan.nextInt();
		
		int arr1[] = new int[size1];
		for(int i=0; i<size1; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter the size of array");
		int size2 = scan.nextInt();
		int arr2[] = new int[size2];
		for(int i=0; i<size2; i++) {
			arr2[i] = scan.nextInt();
		}
		
		ArrayMerge arrMerge = new ArrayMerge();
		arrMerge.merger(arr1, size1, arr2, size2);
		
	}
	

}
