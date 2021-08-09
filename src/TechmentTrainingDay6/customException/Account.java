package TechmentTrainingDay6.customException;

public class Account {
	
	int balance = 5000;
	String withdraw(int amount) {
		if(amount>balance) 
			throw new InSufficentFundException("insufficent fund");
		else 
			return amount + " amount";
		
	}
}
