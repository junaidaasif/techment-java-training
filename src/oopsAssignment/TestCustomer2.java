package oopsAssignment;

import java.util.Scanner;

class Address2{
	private String addressLine;
	private String city;
	public Address2(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		
	}
	
	String getAddressDetails() {
		return addressLine +", " + city;
	}
}

class Customer2{
	private String customerName;
	private Address2 residentialAddress;
	Address2 officialAddress;
	public Customer2(String customerName, Address2 residentialAddress, Address2
			officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	
	void getCustomerDetails() {
		System.out.println("Customer :" + customerName);
		System.out.println("Residential Address :" + residentialAddress.getAddressDetails());
		System.out.println("official Address :" + officialAddress.getAddressDetails());
	}
}
public class TestCustomer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address2 address = new Address2("Ist Main HSR layout", "Banglore");
		Address2 officialAddress = new Address2("Ist Main Electronics layout", "Banglore");
		Customer2 customer = new Customer2("Junaid", address, officialAddress);
		customer.getCustomerDetails();
	}

}
