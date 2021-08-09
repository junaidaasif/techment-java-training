package TechmentTrainingDay6.exception;

import java.io.FileNotFoundException;

class Student{
	void checkEligibility(int age) throws FileNotFoundException{
		if(age>=18) {
			System.out.println("you can apply for load");
		}
		else
			throw new FileNotFoundException("you cannot appl for loan");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Student student = new Student();
			student.checkEligibility(1);
	}

}
