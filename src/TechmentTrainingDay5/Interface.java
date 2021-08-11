package techmentTrainingDay5;

interface JdbcConnection{
	void connect();
}

class Oracle implements JdbcConnection{
	public void connect() {
		System.out.println("I am connecting through Oracle database");
	}
}

class MySQL implements JdbcConnection{
	public void connect() {
		System.out.println("I am connecting through MySQL database");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection connection1 = new Oracle();
		JdbcConnection connection2 = new MySQL();
		connection1.connect();
		connection2.connect();
		
	}

}
