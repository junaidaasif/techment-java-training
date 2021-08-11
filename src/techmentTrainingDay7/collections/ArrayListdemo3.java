package techmentTrainingDay7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> o1 = new ArrayList<Integer> ();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		
		System.out.println("element of 01" + o1);
		
		
		ArrayList<Integer> o2 = new ArrayList<Integer> ();
		o2.add(100);
		o2.add(101);
		o2.add(3);
		o2.add(4);
		
		
//		o2.removeAll(o1); //remove common element
//		o2.retainAll(o1);	//retain common element
		
		Collections.sort(o2);
		
	}
}
