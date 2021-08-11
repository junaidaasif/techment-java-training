package techmentTrainingDay7.collections;

import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		int a = 1;
		Integer b = a;
		System.out.println("size before adding element" + obj.size());
		obj.add(1);
		obj.add("sachin");
		obj.add(24.50);
		
		System.out.println("size of element in list"+ obj.size());
		System.out.println("element in list");

		obj.add(1, "hello");
		System.out.println("element in the list after adding at 1st"+ obj);
	
	
	obj.remove(Integer.valueOf(1));
	System.out.println("element in the list after removing"+ obj);
	
	
	System.out.println("element at second index"+ obj.get(2));

	
	}
	
}
