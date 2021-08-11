package TechmentTrainingDay8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(6);
		hs.add(2);
		hs.add(7);
		hs.add(11);
		hs.add(26);
		
		System.out.println("hashset "+ hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(1);
		lhs.add(6);
		lhs.add(6);
		lhs.add(10);
		lhs.add(11);
		lhs.add(26);
		
		System.out.println("linkedHashSet" + lhs);
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(6);
		ts.add(6);
		ts.add(10);
		ts.add(11);
		ts.add(26);
//		ts.add("Sachin");
		
		System.out.println("treeset :"+ ts);
		
	
		}

}
