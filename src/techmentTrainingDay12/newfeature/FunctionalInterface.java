package techmentTrainingDay12.newfeature;

interface Banking
{
	void rateOfInterest();
	
	default void display()
	{
		System.out.println("This is a default method");
	}
	static void loan()
	{
		System.out.println("You can apply for loan");
	}
}

public class FunctionalInterface {

	public static void main(String[] args) {

	}

}
