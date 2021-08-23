package techmentTrainingDay13.newfeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(11);
		System.out.println(nums);
		nums.forEach(s->System.out.println(s));
		
		nums.forEach(System.out::println);
		nums.stream().sorted().forEach(System.out::println); //Way to Sort the Element(default Natural Sorting)
		
		List<Integer> mySorted=nums.stream().sorted().collect(Collectors.toList());
		System.out.println(mySorted);
		
		List<Integer> myReverse=nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(myReverse);

	}

}

//collect - collect stream and covert into list,map