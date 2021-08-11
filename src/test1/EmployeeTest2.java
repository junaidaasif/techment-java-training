package test1;

class Employee{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee firstName=" + firstName + ", lastName=" + lastName;
	}
	
	
	
	
}

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Mohmmad", "Junaid");
		Employee emp1 = new Employee("Ankit", "Sahu");
		Employee emp2 = new Employee("Prashant", "Singh");
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

}
