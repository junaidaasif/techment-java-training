package techmentTrainingDay7.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println("Element is" + s1);
		
		s1.pop();
		System.out.println("after removing"+ s1);
		
		System.out.println("top element"+ s1.peek());
		
	}

}
