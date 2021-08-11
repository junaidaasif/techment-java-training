	package techmentTrainingDay5;

class Employee{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmployeeInfor() {
		System.out.println("id : " + id);
		System.out.println("name "+ name);
		System.out.println("doorNo :"+ address.doorNo);
		System.out.println("Street name :"+ address.streetName);
		System.out.println("city :"+ address.city);
		System.out.println("pincode :"+ address.pincode);
	}
	
}

class Address{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName =streetName;
		this.city = city;
		this.pincode = pincode;
	}
}

public class HasARelationship {
	public static void main(String[] args) {
		Address address = new Address(101, "korba", "chattisgarh", 490020);
		Employee emp = new Employee(1, "safan", address);
		emp.displayEmployeeInfor();
		
	}
}
