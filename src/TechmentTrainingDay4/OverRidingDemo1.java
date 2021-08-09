package TechmentTrainingDay4;

class Bank{
	public void rateOfIntrest() {
		System.out.println("5%");
	}
 
}

class Sbi extends Bank{
	
	public void rateOfIntrest() {
		System.out.println("10%");
	}
}

class Axis extends Bank{
	
	public void rateOfIntrest() {
		System.out.println("10%");
	}
}
public class OverRidingDemo1 {
	public static void main(String[] args) {
		Sbi obj = new Sbi();
		Bank obj1 = new Sbi();
		obj.rateOfIntrest();
		
	}
}
