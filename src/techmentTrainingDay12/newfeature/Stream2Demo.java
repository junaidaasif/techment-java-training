package techmentTrainingDay12.newfeature;

import java.util.ArrayList;

public class Stream2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer> ();
		
		for(int i=1; i<=10; i++) {
			numbers.add(i);
		}
		
		System.out.println("numbers " + numbers);
		
		numbers.stream().filter(num-> num%2==0).forEach(s->System.out.println(s));
		System.out.println("=========after map==========");
		numbers.stream().map(num->num+5).forEach(s->System.out.println(s));
	}

}
