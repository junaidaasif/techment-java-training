package techmentTrainingDay7.collections;

import java.util.ArrayList;
public class IttretorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		
		System.out.println("element of o1"+ o1);
		
		Iterator<Integer> itr = o1.iterator():
		
			while(itr.hasNext()) {
				System.out.println(itr.next);
			}

	}

}
