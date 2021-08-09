package assignment1;



class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}

 class Person {
	void age(int age) throws AgeException{
		if(age<18)
			throw new AgeException("Invalid");
		else
			System.out.println("welcome to vote");

	}
}


public class InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student = new Person();
		try {
			student.age(20);
		}
		catch(AgeException e){
			System.out.println("Invalid");
		}
	}

}
