package test.test2.program7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(33);
		arr.add(62);
		arr.add(30);
		arr.add(1);
		arr.add(92);
		arr.add(37);
		arr.add(05);
		arr.add(55);
		arr.add(7);
		arr.add(9);
		
		
		
			List<Integer> arr1=arr.subList(0, arr.size()/2);
			List<Integer> arr2=arr.subList(arr.size()/2, arr.size());
			System.out.println(arr1);
			System.out.println(arr2);
	
	
		
		
	}

}