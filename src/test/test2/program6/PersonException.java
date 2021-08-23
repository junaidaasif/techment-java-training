package test.test2.program6;

import java.util.Scanner;

class WeekLengthException extends Exception{
	public WeekLengthException(String msg) {
		super(msg);
	}
}

class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}


class Person{
	private int id;
	private String name;
	private int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public void validationName() throws WeekLengthException{
		if(name.length()<=3) {
				throw new WeekLengthException("please enter valid name");
			}
		
		else {
			System.out.println(this.name);
		}
			
	}
	
	public void validationAge() throws AgeException{
		if(this.age<=15) {
				throw new AgeException("please enter valid name");
			}
		
		else {
			System.out.println(this.name);
		}
			
	}
	
}

public class PersonException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person id :");
		int personId = scan.nextInt();
		
		System.out.println("Enter person name :");
		String personName = scan.next();
		
		System.out.println("Enter person age :");
		int personAge = scan.nextInt();
		
		Person person = new Person(personId, personName,personAge);
		
		
		
		
		try {
			person.validationName();
			person.validationAge();
			
	
		} 
		catch(AgeException e) {
			System.out.println("Age of user should be greater than 15");
		}
		catch (WeekLengthException e) {
			// TODO Auto-generated catch block
		System.out.println("small name");
		}
	}
}




	