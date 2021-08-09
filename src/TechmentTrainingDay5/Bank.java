package TechmentTrainingDay5;

abstract class Bank2{
	void Eligibility()
	{
		System.out.println("Above 18");
	}
	abstract int rateOfInterest(int interestRate);
}
class Axis2 extends BankGive{
	
	int rateOfInterest(int interestRate) {
		System.out.println("My Bank");
		return interestRate;
	}

}
class SBI2 extends BankGive{


	int rateOfInterest(int interestRate) {
		System.out.println("My Bank");
		
		return interestRate;
	}
	
}
public class Bank {

	public static void main(String[] args) {
		BankGive b=new Axis2();
//		System.out.println(b.rateOfInterest(5));
	}

}