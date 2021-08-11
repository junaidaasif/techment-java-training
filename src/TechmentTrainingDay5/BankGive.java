package techmentTrainingDay5;

class Customer{
	int custid;
	String custName;
	Account account;
	public Customer(int custid, String custName, Account account) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.account = account;
	}
	
	public void display() {
		System.out.println("customer id :"+ custid);
		System.out.println("customer name :"+ custName);
		System.out.println("account number :"+ account.accountNo);
		System.out.println("account type :"+ account.accountType);
		System.out.println("account balance :"+ account.balance);
		System.out.println("account brance :"+ account.balance);
	}
}

class Account{
	int accountNo;
	String accountType;
	int balance;
	int ifsc;
	String branch;
	public Account(int accountNo, String accountType, int balance, int ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	
}

public class BankGive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1245, "current", 80000000, 65651, "SBI");
		Customer customer = new Customer(44, "junaid", account);
		
		// TODO Auto-generated method stub
		Account account2 = new Account(1245, "savingt", 400000, 651, "SBI");
		Customer customer2 = new Customer(74, "aashu", account);
		
		// TODO Auto-generated method stub
		Account account3 = new Account(1245, "current", 500000, 655651, "SBI");
		Customer customer3 = new Customer(46, "mohit", account);
		
		customer.display();
		customer2.display();
		customer3.display();

	}

}
