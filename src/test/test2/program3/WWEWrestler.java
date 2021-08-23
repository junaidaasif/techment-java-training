package test.test2.program3;

import java.util.ArrayList;
import java.util.stream.Collectors;

import techmentTrainingDay12.newfeature.Employee;



class WWE{
	//private data members
	private String firstName;
	private String LastName;
	private int weight;
	
	//This is the parameterized constructor
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.weight = weight;
	}
	
	
	//Getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
		
}

class  WWEWrestlerImplementation{
	
	//this will show the number of wrestler
	public long numOfWrestlers(ArrayList<WWE> wwe) {
		long countWrestlers = wwe.stream().count();
		return countWrestlers;
	}
	
	//this will return sum of the weight greater than 200 
	public long sumOfWeight(ArrayList<WWE> wwe) {
	long sum = wwe.stream().filter(p -> (p.getWeight() > 200)).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();;
	return sum;
	}
	
	//this will print the first name of all wrestler
	public void printFirstName(ArrayList<WWE> wwe) {
		wwe.stream().forEach(p -> System.out.println(p.getFirstName()));
	}
	
//	this will print the minimum weight or the wrestler
	public int minWeight(ArrayList<WWE>wwe) {
		int minW = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		return minW;
	}
}

public class WWEWrestler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		
		wwe.add(new WWE("John", "Cena", 100));
		wwe.add(new WWE("Under", "Taker", 119));
		wwe.add(new WWE("Roman", "Reign", 110));
		wwe.add(new WWE("Kurt", "Angle", 208));
		wwe.add(new WWE("The", "Rock", 240));
			
		WWEWrestlerImplementation wweImp = new WWEWrestlerImplementation();
	
		//this will show the number of wrestler
		System.out.println("===================================");
		System.out.println("The numbers of wrestler is :"+ wweImp.numOfWrestlers(wwe));
		System.out.println();
		System.out.println();
		
		//this will show sum of wrestler greater than 200
		System.out.println("===================================");
		System.out.println("The sum of wrestler is :" + wweImp.sumOfWeight(wwe));
		System.out.println();
		System.out.println();
		
		//this will show sum of wrestler greater than 200
		
		System.out.println("===================================");
		System.out.println("minum weight is " + wweImp.minWeight(wwe));
		System.out.println();
		System.out.println();
		
		
	}
	


}
