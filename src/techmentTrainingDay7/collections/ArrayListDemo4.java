package techmentTrainingDay7.collections;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListdemo4 {
	public static void main(String[] args) {
		
		ArrayList<String> o1 = new ArrayList<String> ();
		o1.add("Sachin");
		o1.add("Ravi");
		o1.add("Kumar");
		o1.add("Sowmya");
		
		System.out.println("element of o1" + o1);
		
		
		ArrayList<String> o2 = new ArrayList<String> ();
		o2.add("Sourab");
		o2.add("Manish");
		o2.add("Sachin");
		o2.add("Kumar");
		o2.add("Aashu");
		System.out.println("element of o2" + o2);
		
		o1.removeAll(o2);
		
		o1.addAll(o2);
		
		System.out.println("the joined element are" + o1);
//		o2.removeAll(o1); //remove common element
//		o2.retainAll(o1);	//retain common element
		
		Collections.sort(o1);
		System.out.println("the sorted form is" + o1);
		
	}
}
