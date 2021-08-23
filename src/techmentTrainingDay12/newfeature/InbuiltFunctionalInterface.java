package techmentTrainingDay12.newfeature;

import java.util.function.Predicate;
import java.util.function.Function;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = (num) -> num>10;
		
		System.out.println(predicate.test(20));
		
		Predicate<String> strPredicate = (name) -> name.contains("b");
		
		System.out.println(strPredicate.test("Junaid"));
		
		Function<Integer, Integer> function1 = (num1) -> num1;
		Function<Integer, String> function2 = (num1) -> "value of num1 = " + num1;
		
//		Function<String, Integer> function3 = 
	}

}
