package TechmentTrainingDay6.customException;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		try {
			System.out.println(account.withdraw(2000));
		}
		catch(InSufficentFundException e) {
			System.out.println(e.getMessage());
		}

	}

}
